file://<WORKSPACE>/api/app/model/domain/Task.scala
### java.lang.StringIndexOutOfBoundsException: Range [484, 504) out of bounds for length 497

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.1
Classpath:
<WORKSPACE>/api/conf [exists ], <WORKSPACE>/api/.bloop/root/bloop-bsp-clients-classes/classes-Metals-TRMdlQ6uTNi660pn9cnNQg== [exists ], <HOME>/Library/Caches/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.10.0/semanticdb-javac-0.10.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/twirl/twirl-api_3/2.0.7/twirl-api_3-2.0.7.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-server_3/3.0.5/play-server_3-3.0.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-logback_3/3.0.5/play-logback_3-3.0.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-pekko-http-server_3/3.0.5/play-pekko-http-server_3-3.0.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-filters-helpers_3/3.0.5/play-filters-helpers_3-3.0.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-guice_3/3.0.5/play-guice_3-3.0.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-slick_3/6.1.1/play-slick_3-6.1.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-slick-evolutions_3/6.1.1/play-slick-evolutions_3-6.1.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/postgresql/postgresql/42.7.4/postgresql-42.7.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-xml_3/2.2.0/scala-xml_3-2.2.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play_3/3.0.5/play_3-3.0.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/ch/qos/logback/logback-classic/1.5.6/logback-classic-1.5.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-streams_3/3.0.5/play-streams_3-3.0.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/pekko/pekko-http-core_3/1.0.1/pekko-http-core_3-1.0.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/inject/guice/6.0.0/guice-6.0.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/inject/extensions/guice-assistedinject/6.0.0/guice-assistedinject-6.0.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/slick/slick_3/3.5.1/slick_3-3.5.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/slick/slick-hikaricp_3/3.5.1/slick-hikaricp_3-3.5.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-jdbc-api_3/3.0.4/play-jdbc-api_3-3.0.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-jdbc-evolutions_3/3.0.4/play-jdbc-evolutions_3-3.0.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/checkerframework/checker-qual/3.42.0/checker-qual-3.42.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-build-link/3.0.5/play-build-link-3.0.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-configuration_3/3.0.5/play-configuration_3-3.0.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-api/2.0.13/slf4j-api-2.0.13.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/jul-to-slf4j/2.0.13/jul-to-slf4j-2.0.13.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/jcl-over-slf4j/2.0.13/jcl-over-slf4j-2.0.13.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/pekko/pekko-actor_3/1.0.3/pekko-actor_3-1.0.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/pekko/pekko-actor-typed_3/1.0.3/pekko-actor-typed_3-1.0.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/pekko/pekko-slf4j_3/1.0.3/pekko-slf4j_3-1.0.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/pekko/pekko-serialization-jackson_3/1.0.3/pekko-serialization-jackson_3-1.0.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.14.3/jackson-core-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.14.3/jackson-annotations-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.14.3/jackson-datatype-jdk8-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.14.3/jackson-datatype-jsr310-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.14.3/jackson-databind-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/dataformat/jackson-dataformat-cbor/2.14.3/jackson-dataformat-cbor-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/module/jackson-module-parameter-names/2.14.3/jackson-module-parameter-names-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/module/jackson-module-scala_3/2.14.3/jackson-module-scala_3-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/jsonwebtoken/jjwt-api/0.11.5/jjwt-api-0.11.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/jsonwebtoken/jjwt-impl/0.11.5/jjwt-impl-0.11.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/jsonwebtoken/jjwt-jackson/0.11.5/jjwt-jackson-0.11.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-json_3/3.0.4/play-json_3-3.0.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/guava/guava/32.1.3-jre/guava-32.1.3-jre.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/javax/inject/javax.inject/1/javax.inject-1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/ssl-config-core_3/0.6.1/ssl-config-core_3-0.6.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-parser-combinators_3/2.3.0/scala-parser-combinators_3-2.3.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/ch/qos/logback/logback-core/1.5.6/logback-core-1.5.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivestreams/reactive-streams/1.0.4/reactive-streams-1.0.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/pekko/pekko-stream_3/1.0.3/pekko-stream_3-1.0.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/pekko/pekko-parsing_3/1.0.1/pekko-parsing_3-1.0.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/parboiled/parboiled_3/2.5.0/parboiled_3-2.5.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/jakarta/inject/jakarta.inject-api/2.0.1/jakarta.inject-api-2.0.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/aopalliance/aopalliance/1.0/aopalliance-1.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/errorprone/error_prone_annotations/2.21.1/error_prone_annotations-2.21.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/config/1.4.3/config-1.4.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/zaxxer/HikariCP/4.0.3/HikariCP-4.0.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-exceptions/3.0.5/play-exceptions-3.0.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/thoughtworks/paranamer/paranamer/2.8/paranamer-2.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-functional_3/3.0.4/play-functional_3-3.0.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/j2objc/j2objc-annotations/2.8/j2objc-annotations-2.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/pekko/pekko-protobuf-v3_3/1.0.3/pekko-protobuf-v3_3-1.0.3.jar [exists ]
Options:
-deprecation -unchecked -encoding utf8 -Xsemanticdb -sourceroot <WORKSPACE>/api


action parameters:
offset: 491
uri: file://<WORKSPACE>/api/app/model/domain/Task.scala
text:
```scala
package domain.task
import java.util.{ UUID , Date}


case class Habit(
  name: String,
  goal: String,
  isCompleted:Boolean,
  date: Date,
  id: UUID = UUID.randomUUID()
);

object Habit {
  
  def apply (
    name: String,
    goal: String,
    isCompleted:Boolean,
    date: Date
  ) = {
    new Habit(name,goal,isCompleted,date)
  }
  
  def unapply( habit: Habit ) = {
    Some((
      habit.name,
      habit.goal,
      habit.isCompleted,
      habit.date
    ))
  }

  given Writes[@@]

}


```



#### Error stacktrace:

```
java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:55)
	java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:52)
	java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:213)
	java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:210)
	java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:98)
	java.base/jdk.internal.util.Preconditions.outOfBoundsCheckFromToIndex(Preconditions.java:112)
	java.base/jdk.internal.util.Preconditions.checkFromToIndex(Preconditions.java:349)
	java.base/java.lang.String.checkBoundsBeginEnd(String.java:4865)
	java.base/java.lang.String.substring(String.java:2834)
	scala.meta.internal.pc.PcSymbolSearch$.isGeneratedGiven(PcSymbolSearch.scala:281)
	scala.meta.internal.pc.PcSymbolSearch.soughtSymbols(PcSymbolSearch.scala:127)
	scala.meta.internal.pc.PcSymbolSearch.soughtSymbols$(PcSymbolSearch.scala:24)
	scala.meta.internal.pc.WithSymbolSearchCollector.soughtSymbols(PcCollector.scala:359)
	scala.meta.internal.pc.PcSymbolSearch.soughtSymbols(PcSymbolSearch.scala:51)
	scala.meta.internal.pc.PcSymbolSearch.soughtSymbols$(PcSymbolSearch.scala:24)
	scala.meta.internal.pc.WithSymbolSearchCollector.soughtSymbols$lzyINIT1(PcCollector.scala:359)
	scala.meta.internal.pc.WithSymbolSearchCollector.soughtSymbols(PcCollector.scala:359)
	scala.meta.internal.pc.WithSymbolSearchCollector.result(PcCollector.scala:366)
	scala.meta.internal.pc.PcDocumentHighlightProvider.highlights(PcDocumentHighlightProvider.scala:32)
	scala.meta.internal.pc.ScalaPresentationCompiler.documentHighlight$$anonfun$1(ScalaPresentationCompiler.scala:187)
```
#### Short summary: 

java.lang.StringIndexOutOfBoundsException: Range [484, 504) out of bounds for length 497