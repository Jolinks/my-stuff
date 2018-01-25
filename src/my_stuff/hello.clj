;; hello.clj
(ns my-stuff.hello
  (:require [ring.adapter.jetty :as jetty]))

(defn handler [request]
  {:status 200,
   :headers {"Content-Type" "text/html"}
   :body "Hello World!"})

(defn start-server []
  (jetty/run-jetty handler {:host "localhost",
                            :port 3000}))

(start-server)