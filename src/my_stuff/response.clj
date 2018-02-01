(ns my-stuff.response)

(defn response [data & [status]]
  {:status (or status 200)
   :headers {"Content-type", "text/html;charset=UTF-8"}
   :body data})
