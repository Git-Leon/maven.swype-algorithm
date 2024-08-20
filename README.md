# Swype text algorithm
* **Objective**
	* to implement a swype-keyboard texting algorithm
* **Purpose**
	* to test algorithmic thinking
* **Description**
	* Given an input `String`, representative of characters that have been swyped over, return potential words that the client could be seeking. 

## Background
* Algorithm behind the swype keyboard [here](https://www.howtogeek.com/106643/how-to-type-faster-with-the-swype-keyboard-for-android/)
* Consider
```
Path: "bnhjkioikjhnbvcxsza"
Dictionary: [“apple”, “boba”, “tea”, “non”]
Output: [“boba”, “non”]
```

* Affirm
```
f("bnhjkioikjhnbvcxsza") = [“boba”, “non”]
f("nhjkioikjhn") = ["kik", “non”]
```
