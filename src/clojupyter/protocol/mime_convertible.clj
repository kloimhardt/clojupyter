(ns clojupyter.protocol.mime-convertible
  (:require
   [clojupyter.util			:as u]))

(defprotocol PMimeConvertible
  (to-mime [o]))

(def stream-to-string u/stream-to-string)



