;; http://www.4clojure.com/problem/1
;; Nothing but the Truth
;; Difficulty: Elementary Topics:
;; Description: This is a clojure form. Enter a value which will make the form evaluate to true. Don't over think it! If you are confused, see the getting started page. Hint: true is equal to true. 
;; TestCases: 
;; (= __ true)
true

;; http://www.4clojure.com/problem/2
;; Simple math
;; Difficulty:	Elementary
;; Description:  If you are not familiar with polish notation, simple arithmetic might seem confusing.
;; Test caes:
;; (= (- 10 (* 2 3)) __)
4

;; http://www.4clojure.com/problem/3
;; Intro to Strings
;; Difficulty: Elementary Topics:
;; Description: Clojure strings are Java strings. This means that you can use any of the Java string methods on Clojure strings. 
;; TestCases: 
;; (= __ (.toUpperCase "hello world"))
"HELLO WORLD"


;; http://www.4clojure.com/problem/4
;; Intro to Lists
;; Difficulty: Elementary Topics:
;; Description: Lists can be constructed with either a function or a quoted form. 
;; TestCases: 
;; (= (list __) '(:a :b :c))
:a :b :c


;; http://www.4clojure.com/problem/5
;; Lists: conj
;; Difficulty: Elementary Topics:
;; Description: When operating on a list, the conj function will return a new list with one or more items "added" to the front. 
;; TestCases: 
;; (= __ (conj '(2 3 4) 1))
;; (= __ (conj '(3 4) 2 1))
'(1 2 3 4)


;; http://www.4clojure.com/problem/6
;; Intro to Vectors
;; Difficulty: Elementary Topics:
;; Description: Vectors can be constructed several ways. You can compare them with lists. 
;; TestCases: 
;; (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))
:a :b :c


;; http://www.4clojure.com/problem/7
;; Vectors: conj
;; Difficulty: Elementary Topics:
;; Description: When operating on a Vector, the conj function will return a new vector with one or more items "added" to the end. 
;; TestCases: 
;; (= __ (conj [1 2 3] 4))
;; (= __ (conj [1 2] 3 4))
[1 2 3 4]


;; http://www.4clojure.com/problem/8
;; Intro to Sets
;; Difficulty: Elementary Topics:
;; Description: Sets are collections of unique values. 
;; TestCases: 
;; (= __ (set '(:a :a :b :c :c :c :c :d :d)))
;; (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))
#{:a :b :c :d}


;; http://www.4clojure.com/problem/9
;; Sets: conj
;; Difficulty: Elementary Topics:
;; Description: When operating on a set, the conj function returns a new set with one or more keys "added". 
;; TestCases: 
;; (= #{1 2 3 4} (conj #{1 4 3} __))
2


;; http://www.4clojure.com/problem/10
;; Intro to Maps
;; Difficulty: Elementary Topics:
;; Description: Maps store key-value pairs. Both maps and keywords can be used as lookup functions. Commas can be used to make maps more readable, but they are not required. 
;; TestCases: 
;; (= __ ((hash-map :a 10, :b 20, :c 30) :b))
;; (= __ (:b {:a 10, :b 20, :c 30}))
20


;; http://www.4clojure.com/problem/11
;; Maps: conj
;; Difficulty: Elementary Topics:
;; Description: When operating on a map, the conj function returns a new map with one or more key-value pairs "added". 
;; TestCases: 
;; (= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))
{:b 2}


;; http://www.4clojure.com/problem/12
;; Intro to Sequences
;; Difficulty: Elementary Topics:
;; Description: All Clojure collections support sequencing. You can operate on sequences with functions like first, second, and last. 
;; TestCases: 
;; (= __ (first '(3 2 1)))
;; (= __ (second [2 3 4]))
;; (= __ (last (list 1 2 3)))
3


;; http://www.4clojure.com/problem/13
;; Sequences: rest
;; Difficulty: Elementary Topics:
;; Description: The rest function will return all the items of a sequence except the first. 
;; TestCases: 
;; (= __ (rest [10 20 30 40]))
[20 30 40]


;; http://www.4clojure.com/problem/14
;; Intro to Functions
;; Difficulty: Elementary Topics:
;; Description: Clojure has many different ways to create functions. 
;; TestCases: 
;; (= __ ((fn add-five [x] (+ x 5)) 3))
;; (= __ ((fn [x] (+ x 5)) 3))
;; (= __ (#(+ % 5) 3))
;; (= __ ((partial + 5) 3))
8


;; http://www.4clojure.com/problem/15
;; Double Down
;; Difficulty: Elementary Topics:
;; Description: Write a function which doubles a number. 
;; TestCases: 
;; (= (__ 2) 4)
;; (= (__ 3) 6)
;; (= (__ 11) 22)
;; (= (__ 7) 14)
(partial * 2)


;; http://www.4clojure.com/problem/16
;; Hello World
;; Difficulty: Elementary Topics:
;; Description: Write a function which returns a personalized greeting. 
;; TestCases: 
;; (= (__ "Dave") "Hello, Dave!")
;; (= (__ "Jenn") "Hello, Jenn!")
;; (= (__ "Rhea") "Hello, Rhea!")
(fn [name] (str "Hello, " name "!"))


;; http://www.4clojure.com/problem/17
;; Sequences: map
;; Difficulty: Elementary Topics:
;; Description: The map function takes two arguments: a function (f) and a sequence (s). Map returns a new sequence consisting of the result of applying f to each item of s. Do not confuse the map function with the map data structure. 
;; TestCases: 
;; (= __ (map #(+ % 5) '(1 2 3)))
(list 6 7 8)


;; http://www.4clojure.com/problem/18
;; Sequences: filter
;; Difficulty: Elementary Topics:
;; Description: The filter function takes two arguments: a predicate function (f) and a sequence (s). Filter returns a new sequence consisting of all the items of s for which (f item) returns true. 
;; TestCases: 
;; (= __ (filter #(> % 5) '(3 4 5 6 7)))
(list 6 7 )


;; http://www.4clojure.com/problem/19
;; Last Element
;; Difficulty: Easy Topics: seqs core-functions
;; Description: Write a function which returns the last element in a sequence.  Special Restrictions last
;; TestCases: 
;; (= (__ [1 2 3 4 5]) 5)
;; (= (__ '(5 4 3)) 3)
;; (= (__ ["b" "c" "d"]) "d")
#(first (reverse %))


;; http://www.4clojure.com/problem/20
;; Penultimate Element
;; Difficulty: Easy Topics: seqs
;; Description: Write a function which returns the second to last element from a sequence. 
;; TestCases: 
;; (= (__ (list 1 2 3 4 5)) 4)
;; (= (__ ["a" "b" "c"]) "b")
;; (= (__ [[1 2] [3 4]]) [1 2])
(fn [sequ]
  (let [noele (- (count sequ) 2)]
    (nth sequ noele)))


;; http://www.4clojure.com/problem/21
;; Nth Element
;; Difficulty: Easy Topics: seqs core-functions
;; Description: Write a function which returns the Nth element from a sequence 
;; TestCases: 
;; (= (__ '(4 5 6 7) 2) 6)
;; (= (__ [:a :b :c) 0) :a)
;; (= (__ [1 2 3 4] 1) 2)
;; (= (__'([1 2] [3 4] [5 6]) 2) [5 6])
#(first(drop %2 %1))


;; http://www.4clojure.com/problem/22
;; Count a Sequence
;; Difficulty: Easy Topics: seqs core-functions
;; Description: Write a function which returns the total number of elements in a sequence.  Special Restrictions count
;; TestCases: 
;; (= (__ '(1 2 3 3 1)) 5)
;; (= (__ "Hello World") 11)
;; (= (__ [[1 2] [3 4] [5 6]]) 3)
;; (= (__ '(13)) 1)
;; (= (__ '(:a :b :c)) 3)




