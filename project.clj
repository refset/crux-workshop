(defproject myproject "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [pro.juxt.crux/crux-core "1.18.0"] ;; added these
                 [pro.juxt.crux/crux-rocksdb "1.18.0"]
                 [pro.juxt.crux/crux-lucene "1.18.0"]
                 [pro.juxt.crux/crux-http-server "1.18.0"]] ;; but otherwise is vanilla "lein new app myproject"
  :main ^:skip-aot myproject.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
