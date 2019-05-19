(ns gbf.core
  (:require [clojure.tools.cli :refer [parse-opts]])
  (:gen-class))

(def cli-options
  [["-h" "--help"]])

(defn -main [& args]
  (parse-opts args cli-options))
