  (= "longest" (reduce (fn [a b]
                         (if (< a b) b a))
                       ["which" "word" "is" "longest"]))

  (let [a "word" b "is"]
    (if (< (count a) (count b)) b a)
    )


(def v (interpose "," ["dog" "cat" "mouse"]))
(str v)
(str "dog" "cat" "mouse")
(apply str v)
(doall (str v))

(defn upit [n] (* n n))
(upit 5)
(apply upit [3])




(def matrix
  [[1 2 3]
   [4 5 6]
   [7 8 9]])


(defn neighbors
  ([size yx] (neighbors [[-1 0] [1 0] [0 -1] [0 1]] size yx))
  ([deltas size yx]
   (filter (fn [new-yx]
             (every? #(< -1 % size) new-yx))
           (map #(map + yx %) deltas))))

(map #(get-in matrix %) (neighbors 3 [0 0]))_

(defn foo
  ([x] (* x x))
  ([x y] (* x y)))

(foo 5)
(foo 5 10)
