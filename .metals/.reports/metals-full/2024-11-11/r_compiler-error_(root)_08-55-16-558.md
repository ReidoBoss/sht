file://<WORKSPACE>/api/app/controllers/HabitController.scala
### java.lang.AssertionError: assertion failed: denotation class Object invalid in run 3. ValidFor: Period(1..2, run = 4)

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.1
Classpath:
<WORKSPACE>/api/conf [exists ], <WORKSPACE>/api/.bloop/root/bloop-bsp-clients-classes/classes-Metals-TRMdlQ6uTNi660pn9cnNQg== [exists ], <HOME>/Library/Caches/bloop/semanticdb/com.sourcegraph.semanticdb-javac.0.10.0/semanticdb-javac-0.10.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala3-library_3/3.3.3/scala3-library_3-3.3.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/twirl/twirl-api_3/2.0.7/twirl-api_3-2.0.7.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-server_3/3.0.5/play-server_3-3.0.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-logback_3/3.0.5/play-logback_3-3.0.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-pekko-http-server_3/3.0.5/play-pekko-http-server_3-3.0.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-filters-helpers_3/3.0.5/play-filters-helpers_3-3.0.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-guice_3/3.0.5/play-guice_3-3.0.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-slick_3/6.1.1/play-slick_3-6.1.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-slick-evolutions_3/6.1.1/play-slick-evolutions_3-6.1.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/postgresql/postgresql/42.7.4/postgresql-42.7.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-xml_3/2.2.0/scala-xml_3-2.2.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play_3/3.0.5/play_3-3.0.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/ch/qos/logback/logback-classic/1.5.6/logback-classic-1.5.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-streams_3/3.0.5/play-streams_3-3.0.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/pekko/pekko-http-core_3/1.0.1/pekko-http-core_3-1.0.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/inject/guice/6.0.0/guice-6.0.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/inject/extensions/guice-assistedinject/6.0.0/guice-assistedinject-6.0.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/slick/slick_3/3.5.1/slick_3-3.5.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/slick/slick-hikaricp_3/3.5.1/slick-hikaricp_3-3.5.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-jdbc-api_3/3.0.4/play-jdbc-api_3-3.0.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-jdbc-evolutions_3/3.0.4/play-jdbc-evolutions_3-3.0.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/checkerframework/checker-qual/3.42.0/checker-qual-3.42.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-build-link/3.0.5/play-build-link-3.0.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-configuration_3/3.0.5/play-configuration_3-3.0.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/slf4j-api/2.0.13/slf4j-api-2.0.13.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/jul-to-slf4j/2.0.13/jul-to-slf4j-2.0.13.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/slf4j/jcl-over-slf4j/2.0.13/jcl-over-slf4j-2.0.13.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/pekko/pekko-actor_3/1.0.3/pekko-actor_3-1.0.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/pekko/pekko-actor-typed_3/1.0.3/pekko-actor-typed_3-1.0.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/pekko/pekko-slf4j_3/1.0.3/pekko-slf4j_3-1.0.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/pekko/pekko-serialization-jackson_3/1.0.3/pekko-serialization-jackson_3-1.0.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.14.3/jackson-core-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.14.3/jackson-annotations-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.14.3/jackson-datatype-jdk8-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.14.3/jackson-datatype-jsr310-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.14.3/jackson-databind-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/dataformat/jackson-dataformat-cbor/2.14.3/jackson-dataformat-cbor-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/module/jackson-module-parameter-names/2.14.3/jackson-module-parameter-names-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/fasterxml/jackson/module/jackson-module-scala_3/2.14.3/jackson-module-scala_3-2.14.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/jsonwebtoken/jjwt-api/0.11.5/jjwt-api-0.11.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/jsonwebtoken/jjwt-impl/0.11.5/jjwt-impl-0.11.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/io/jsonwebtoken/jjwt-jackson/0.11.5/jjwt-jackson-0.11.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-json_3/3.0.4/play-json_3-3.0.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/guava/guava/32.1.3-jre/guava-32.1.3-jre.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/javax/inject/javax.inject/1/javax.inject-1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/ssl-config-core_3/0.6.1/ssl-config-core_3-0.6.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/scala-lang/modules/scala-parser-combinators_3/2.3.0/scala-parser-combinators_3-2.3.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/ch/qos/logback/logback-core/1.5.6/logback-core-1.5.6.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/reactivestreams/reactive-streams/1.0.4/reactive-streams-1.0.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/pekko/pekko-stream_3/1.0.3/pekko-stream_3-1.0.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/pekko/pekko-parsing_3/1.0.1/pekko-parsing_3-1.0.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/parboiled/parboiled_3/2.5.0/parboiled_3-2.5.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/jakarta/inject/jakarta.inject-api/2.0.1/jakarta.inject-api-2.0.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/aopalliance/aopalliance/1.0/aopalliance-1.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/errorprone/error_prone_annotations/2.21.1/error_prone_annotations-2.21.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/typesafe/config/1.4.3/config-1.4.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/zaxxer/HikariCP/4.0.3/HikariCP-4.0.3.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-exceptions/3.0.5/play-exceptions-3.0.5.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/lz4/lz4-java/1.8.0/lz4-java-1.8.0.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/thoughtworks/paranamer/paranamer/2.8/paranamer-2.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/playframework/play-functional_3/3.0.4/play-functional_3-3.0.4.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/com/google/j2objc/j2objc-annotations/2.8/j2objc-annotations-2.8.jar [exists ], <HOME>/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/apache/pekko/pekko-protobuf-v3_3/1.0.3/pekko-protobuf-v3_3-1.0.3.jar [exists ]
Options:
-deprecation -unchecked -encoding utf8 -Xsemanticdb -sourceroot <WORKSPACE>/api


action parameters:
offset: 332
uri: file://<WORKSPACE>/api/app/controllers/HabitController.scala
text:
```scala
package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json._

@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(Json.toJson("message" -> "conne@@cted"))
  }
}

```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:8)
	dotty.tools.dotc.core.Denotations$SingleDenotation.updateValidity(Denotations.scala:717)
	dotty.tools.dotc.core.Denotations$SingleDenotation.bringForward(Denotations.scala:742)
	dotty.tools.dotc.core.Denotations$SingleDenotation.toNewRun$1(Denotations.scala:799)
	dotty.tools.dotc.core.Denotations$SingleDenotation.current(Denotations.scala:870)
	dotty.tools.dotc.core.Symbols$Symbol.recomputeDenot(Symbols.scala:120)
	dotty.tools.dotc.core.Symbols$Symbol.computeDenot(Symbols.scala:114)
	dotty.tools.dotc.core.Symbols$Symbol.denot(Symbols.scala:107)
	dotty.tools.dotc.core.Symbols$.toDenot(Symbols.scala:494)
	dotty.tools.dotc.core.Denotations$SingleDenotation.updateValidity(Denotations.scala:716)
	dotty.tools.dotc.core.Denotations$SingleDenotation.bringForward(Denotations.scala:742)
	dotty.tools.dotc.core.Denotations$SingleDenotation.toNewRun$1(Denotations.scala:799)
	dotty.tools.dotc.core.Denotations$SingleDenotation.current(Denotations.scala:870)
	dotty.tools.dotc.core.Types$NamedType.computeDenot(Types.scala:2364)
	dotty.tools.dotc.core.Types$NamedType.denot(Types.scala:2324)
	dotty.tools.dotc.core.Types$NamedType.computeSymbol(Types.scala:2281)
	dotty.tools.dotc.core.Types$NamedType.symbol(Types.scala:2274)
	dotty.tools.dotc.core.Types$Type.classSymbol(Types.scala:507)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.traverse$1(SymDenotations.scala:1966)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.computeBaseData(SymDenotations.scala:1973)
	dotty.tools.dotc.core.SymDenotations$BaseDataImpl.apply(SymDenotations.scala:2960)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.baseData(SymDenotations.scala:1939)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.baseClassSet(SymDenotations.scala:1955)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.derivesFrom(SymDenotations.scala:1981)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.isValueClass(SymDenotations.scala:2019)
	dotty.tools.dotc.transform.ValueClasses$.isDerivedValueClass(ValueClasses.scala:19)
	dotty.tools.dotc.core.TypeErasure$.dotty$tools$dotc$core$TypeErasure$$$erasureDependsOnArgs(TypeErasure.scala:75)
	dotty.tools.dotc.core.TypeErasure.dotty$tools$dotc$core$TypeErasure$$sigName(TypeErasure.scala:870)
	dotty.tools.dotc.core.TypeErasure$.sigName(TypeErasure.scala:204)
	dotty.tools.dotc.core.Signature$.apply(Signature.scala:167)
	dotty.tools.dotc.core.Types$MethodOrPoly.computeSignature$2(Types.scala:3727)
	dotty.tools.dotc.core.Types$MethodOrPoly.signature(Types.scala:3752)
	dotty.tools.dotc.core.Denotations$SingleDenotation.signature(Denotations.scala:617)
	dotty.tools.dotc.core.Denotations$SingleDenotation.matchesLoosely(Denotations.scala:1023)
	dotty.tools.dotc.core.Denotations$SingleDenotation.matches(Denotations.scala:1007)
	dotty.tools.dotc.core.Denotations$Denotation.mergeDenot$1(Denotations.scala:409)
	dotty.tools.dotc.core.Denotations$Denotation.meet(Denotations.scala:499)
	dotty.tools.dotc.core.Denotations$DenotUnion.toDenot(Denotations.scala:1229)
	dotty.tools.dotc.core.Denotations$DenotUnion.toDenot(Denotations.scala:1229)
	dotty.tools.dotc.core.SymDenotations$ClassDenotation.findMember(SymDenotations.scala:2145)
	dotty.tools.dotc.core.Types$Type.go$1(Types.scala:695)
	dotty.tools.dotc.core.Types$Type.findMember(Types.scala:874)
	dotty.tools.dotc.core.Types$Type.memberBasedOnFlags(Types.scala:678)
	dotty.tools.dotc.core.Types$Type.member(Types.scala:662)
	dotty.tools.dotc.typer.ProtoTypes$SelectionProto.liftedTree1$1(ProtoTypes.scala:206)
	dotty.tools.dotc.typer.ProtoTypes$SelectionProto.isMatchedBy(ProtoTypes.scala:228)
	dotty.tools.dotc.core.TypeComparer.isMatchedByProto(TypeComparer.scala:2055)
	dotty.tools.dotc.core.TypeComparer.firstTry$1(TypeComparer.scala:339)
	dotty.tools.dotc.core.TypeComparer.recur(TypeComparer.scala:1469)
	dotty.tools.dotc.core.TypeComparer.isSubType(TypeComparer.scala:208)
	dotty.tools.dotc.core.TypeComparer.isSubType(TypeComparer.scala:218)
	dotty.tools.dotc.core.TypeComparer.topLevelSubType(TypeComparer.scala:128)
	dotty.tools.dotc.core.TypeComparer.testSubType(TypeComparer.scala:144)
	dotty.tools.dotc.core.TypeComparer$.testSubType(TypeComparer.scala:2955)
	dotty.tools.dotc.typer.Typer.adaptNoArgsOther$1(Typer.scala:3980)
	dotty.tools.dotc.typer.Typer.adaptNoArgs$1(Typer.scala:4062)
	dotty.tools.dotc.typer.Typer.adapt1(Typer.scala:4268)
	dotty.tools.dotc.typer.Typer.adapt(Typer.scala:3587)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3184)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3188)
	dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:3300)
	dotty.tools.dotc.typer.Typer.typeSelectOnTerm$1(Typer.scala:752)
	dotty.tools.dotc.typer.Typer.typedSelect(Typer.scala:790)
	dotty.tools.dotc.typer.Typer.tryApply$1(Typer.scala:3387)
	dotty.tools.dotc.typer.Typer.tryInsertApplyOrImplicit$$anonfun$2(Typer.scala:3418)
	dotty.tools.dotc.typer.Typer.tryEither(Typer.scala:3324)
	dotty.tools.dotc.typer.Typer.tryInsertApplyOrImplicit(Typer.scala:3425)
	dotty.tools.dotc.typer.Typer.adaptToArgs$1(Typer.scala:3707)
	dotty.tools.dotc.typer.Typer.adapt1(Typer.scala:4263)
	dotty.tools.dotc.typer.Typer.adapt(Typer.scala:3587)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3184)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3188)
	dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:3300)
	dotty.tools.dotc.typer.Applications.realApply$1(Applications.scala:941)
	dotty.tools.dotc.typer.Applications.typedApply(Applications.scala:1101)
	dotty.tools.dotc.typer.Applications.typedApply$(Applications.scala:352)
	dotty.tools.dotc.typer.Typer.typedApply(Typer.scala:116)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3048)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3112)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3184)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3188)
	dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:3300)
	dotty.tools.dotc.typer.Namer.typedAheadExpr$$anonfun$1(Namer.scala:1653)
	dotty.tools.dotc.typer.Namer.typedAhead(Namer.scala:1643)
	dotty.tools.dotc.typer.Namer.typedAheadExpr(Namer.scala:1653)
	dotty.tools.dotc.typer.Namer.typedAheadRhs$1$$anonfun$1(Namer.scala:1906)
	dotty.tools.dotc.inlines.PrepareInlineable$.dropInlineIfError(PrepareInlineable.scala:243)
	dotty.tools.dotc.typer.Namer.typedAheadRhs$1(Namer.scala:1906)
	dotty.tools.dotc.typer.Namer.rhsType$1(Namer.scala:1914)
	dotty.tools.dotc.typer.Namer.cookedRhsType$1(Namer.scala:1932)
	dotty.tools.dotc.typer.Namer.lhsType$1(Namer.scala:1933)
	dotty.tools.dotc.typer.Namer.inferredResultType(Namer.scala:1944)
	dotty.tools.dotc.typer.Namer.inferredType$1(Namer.scala:1691)
	dotty.tools.dotc.typer.Namer.valOrDefDefSig(Namer.scala:1698)
	dotty.tools.dotc.typer.Namer.defDefSig(Namer.scala:1789)
	dotty.tools.dotc.typer.Namer$Completer.typeSig(Namer.scala:791)
	dotty.tools.dotc.typer.Namer$Completer.completeInCreationContext(Namer.scala:934)
	dotty.tools.dotc.typer.Namer$Completer.complete(Namer.scala:814)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.completeFrom(SymDenotations.scala:174)
	dotty.tools.dotc.core.Denotations$Denotation.completeInfo$1(Denotations.scala:187)
	dotty.tools.dotc.core.Denotations$Denotation.info(Denotations.scala:189)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.ensureCompleted(SymDenotations.scala:393)
	dotty.tools.dotc.typer.Typer.retrieveSym(Typer.scala:2989)
	dotty.tools.dotc.typer.Typer.typedNamed$1(Typer.scala:3014)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3111)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3184)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3188)
	dotty.tools.dotc.typer.Typer.traverse$1(Typer.scala:3210)
	dotty.tools.dotc.typer.Typer.typedStats(Typer.scala:3256)
	dotty.tools.dotc.typer.Typer.typedClassDef(Typer.scala:2669)
	dotty.tools.dotc.typer.Typer.typedTypeOrClassDef$1(Typer.scala:3036)
	dotty.tools.dotc.typer.Typer.typedNamed$1(Typer.scala:3040)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3111)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3184)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3188)
	dotty.tools.dotc.typer.Typer.traverse$1(Typer.scala:3210)
	dotty.tools.dotc.typer.Typer.typedStats(Typer.scala:3256)
	dotty.tools.dotc.typer.Typer.typedPackageDef(Typer.scala:2812)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3081)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3112)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3184)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3188)
	dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:3300)
	dotty.tools.dotc.typer.TyperPhase.typeCheck$$anonfun$1(TyperPhase.scala:44)
	dotty.tools.dotc.typer.TyperPhase.typeCheck$$anonfun$adapted$1(TyperPhase.scala:54)
	scala.Function0.apply$mcV$sp(Function0.scala:42)
	dotty.tools.dotc.core.Phases$Phase.monitor(Phases.scala:440)
	dotty.tools.dotc.typer.TyperPhase.typeCheck(TyperPhase.scala:54)
	dotty.tools.dotc.typer.TyperPhase.runOn$$anonfun$3(TyperPhase.scala:88)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:333)
	dotty.tools.dotc.typer.TyperPhase.runOn(TyperPhase.scala:88)
	dotty.tools.dotc.Run.runPhases$1$$anonfun$1(Run.scala:246)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.ArrayOps$.foreach$extension(ArrayOps.scala:1321)
	dotty.tools.dotc.Run.runPhases$1(Run.scala:262)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1(Run.scala:270)
	dotty.tools.dotc.Run.compileUnits$$anonfun$adapted$1(Run.scala:279)
	dotty.tools.dotc.util.Stats$.maybeMonitored(Stats.scala:67)
	dotty.tools.dotc.Run.compileUnits(Run.scala:279)
	dotty.tools.dotc.Run.compileSources(Run.scala:194)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:165)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.WithCompilationUnit.<init>(WithCompilationUnit.scala:28)
	scala.meta.internal.pc.WithSymbolSearchCollector.<init>(PcCollector.scala:362)
	scala.meta.internal.pc.PcDocumentHighlightProvider.<init>(PcDocumentHighlightProvider.scala:16)
	scala.meta.internal.pc.ScalaPresentationCompiler.documentHighlight$$anonfun$1(ScalaPresentationCompiler.scala:187)
```
#### Short summary: 

java.lang.AssertionError: assertion failed: denotation class Object invalid in run 3. ValidFor: Period(1..2, run = 4)