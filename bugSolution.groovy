```groovy
def myMethod(List<String> list) {
  boolean shouldStop = false
  list.each { element ->
    println element
    if (element == "stop") {
      shouldStop = true
      return // Now the return statement exits the loop, as intended
    }
  }
  if (!shouldStop) {
    println "This will execute only if 'stop' is not encountered"
  }
}

myMethod(["a", "b", "stop", "c"])

//Alternative solution using break
def myMethod2(List<String> list) {
  list.each { element ->
    println element
    if (element == "stop") {
      return //This exits the loop and the function
    }
  }
  println "This will always execute"
}

myMethod2(["a", "b", "stop", "c"])
```