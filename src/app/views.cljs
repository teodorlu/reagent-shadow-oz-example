(ns app.views
  (:require [oz.core :as oz]))


(defn group-data [& names]
  (apply concat (for [n names]
                  (map-indexed (fn [i y] {:x i :y y :col n}) (take 20
                                                                   (repeatedly #(rand-int 100)))))))
(group-data "monkey" "slipper" "broom")

(def line-plot
  {:data {:values (group-data "monkey" "slipper" "broom" "dragon")}
   :encoding {:x {:field "x"}
              :y {:field "y"}
              :color {:field "col" :type "nominal"}}
   :mark "line"})

(defn header
  []
  [:div
   [:h1 "A template for oz apps"]])


(defn app []
  [:div
   [header]
   [oz.core/vega-lite line-plot]
   ])
