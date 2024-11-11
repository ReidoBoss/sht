package repo.habit

import javax.inject._
import scala.concurrent.Future
import domain.habit.HabitHistory
import play.api.db.slick.DatabaseConfigProvider
import java.util.{Date => UtilDate, UUID}
import java.sql.Date
import slick.jdbc.JdbcType
import slick.ast.BaseTypedType
import slick.jdbc.PostgresProfile.api._

@Singleton
class HabitHistoryRepo @Inject()(dcp: DatabaseConfigProvider) {

  val dbConfig = dcp.get[slick.jdbc.PostgresProfile]
  import dbConfig._
  import profile.api._

  implicit val utilDateColumnType: JdbcType[UtilDate] with BaseTypedType[UtilDate] =
    MappedColumnType.base[UtilDate, Date](
      utilDate => new Date(utilDate.getTime),
      sqlDate => new UtilDate(sqlDate.getTime)
    )

  class HabitHistoryTable(tag:Tag) extends Table[HabitHistory](tag,"HABIT_HISTORY"){
    val idHabit = column[UUID]("ID_HABIT")
    val isDone = column[Boolean]("IS_DONE")
    val date = column[UtilDate]("DATE", O.SqlType("DATE"))
    def * = (idHabit,isDone,date).mapTo[HabitHistory]
  }

  val histories = TableQuery[HabitHistoryTable]

  def add(history: HabitHistory):Future[Int] = {
    val action = histories += history
    db.run(action)
  }

  def updateById(id:UUID,isDone:Boolean):Future[Int] = {
    val action = histories.filter(_.idHabit === id).map(_.isDone).update(isDone)
    db.run(action)
  }

  def getById(id:UUID):Future[Option[HabitHistory]] = {
    val action = histories.filter(_.idHabit === id).result.headOption
    db.run(action)
  }

  def getByDate(date:UtilDate):Future[Seq[HabitHistory]] = {
    val action = histories.filter(_.date === date).result
    db.run(action)
  }

}
