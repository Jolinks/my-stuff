(ns my-stuff.db
  (:use korma.db
        korma.core))

(defdb korma-db (mysql {:db "school",
                        :host "localhost",
                        :port 3306,
                        :user "root",
                        :password "bearywork"}))

(declare courses)
(defentity courses)


;(insert courses
;        (values { :id "s-201", :name "SQL", :price 99.9, :online false, :days 30 }))

(println (select courses
                 (where {:online false})
                 (order :name :asc)))

