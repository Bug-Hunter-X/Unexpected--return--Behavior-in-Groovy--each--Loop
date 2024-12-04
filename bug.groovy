```groovy
def myMethod(List<String> list) {
  list.each { element ->
    println element
    if (element == "stop") {
      return // This only exits the each loop, not the method
    }
  }
  println "This will always execute"
}

myMethod(["a", "b", "stop", "c"])
```