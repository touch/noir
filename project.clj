(defproject org.clojars.touch/noir "1.3.2-SNAPSHOT"
  :description "Noir - a clojure web framework"
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :url "http://webnoir.org"
  :codox {:exclude [noir.exception noir.content.defaults
                    noir.content.getting-started]}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [lib-noir "0.9.9" :exclusions [ring]]
                 [compojure "1.6.2"]
                 [bultitude "0.2.0"]
                 [ring/ring-core "1.8.1"]
                 [ring/ring-devel "1.8.1"]
                 [clj-stacktrace "0.2.5"]
                 [org.clojure/tools.macro "0.1.1"]]
  :pom-plugins [[com.theoryinpractise/clojure-maven-plugin "1.3.23"
                 {:extensions "true"
                  :configuration ([:sourceDirectories [:sourceDirectory "src"]]
                                  [:temporaryOutputDirectory "true"]
                                  [:vmargs "-Xmx256m -XX:MaxPermSize=256m -XX:+UseConcMarkSweepGC -XX:+CMSClassUnloadingEnabled"])
                  :executions [:execution
                               [:id "compile-clojure"]
                               [:phase "compile"]
                               [:goals [:goal "compile"]]]}]])