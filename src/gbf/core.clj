(ns gbf.core
  (:require [clojure.tools.cli :refer [parse-opts]])
  (:gen-class))

(def cli-options
  [["-h" "--help"]]
  ["-f" "--file FILE_PATH" "file path"])

(defn -main [& args]
  (parse-opts args cli-options))
