package repo.habit

import javax.inject._
import scala.concurrent.Future
import domain.habit.Habit
import play.api.db.slick.DatabaseConfigProvider
import java.util.{Date => UtilDate, UUID}
import java.sql.Date
import slick.jdbc.JdbcType
import slick.ast.BaseTypedType
import slick.jdbc.PostgresProfile.api._

@Singleton
class HabitRepo @Inject()(dcp: DatabaseConfigProvider) {

  val dbConfig = dcp.get[slick.jdbc.PostgresProfile]
  import dbConfig._
  import profile.api._

  implicit val utilDateColumnType: JdbcType[UtilDate] with BaseTypedType[UtilDate] =
    MappedColumnType.base[UtilDate, Date](
      utilDate => new Date(utilDate.getTime),
      sqlDate => new UtilDate(sqlDate.getTime)
    )

  class HabitTable(tag: Tag) extends Table[Habit](tag, "HABITS") {
    def id = column[UUID]("ID", O.PrimaryKey)
    def name = column[String]("NAME")
    def goal = column[String]("GOAL")
    // def isDone = column[Boolean]("IS_DONE")
    // def date = column[UtilDate]("DATE", O.SqlType("DATE"))
    def * = (name,goal,id).mapTo[Habit]
  }

  val habits = TableQuery[HabitTable]

  def add ( habit:Habit ): Future[Int] = {
    val action = habits += habit
    db.run(action)
  }

  def getByName ( name:String ):Future[Option[Habit]] = {
    val action = habits.filter(_.name === name).result.headOption
    db.run(action)
  }

  def getAll: Future[Seq[Habit]] = {
    val action = habits.result
    db.run(action)
  }
}
