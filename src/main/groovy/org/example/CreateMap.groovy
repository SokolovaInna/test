package org.example

class CreateMap {
  static Map<Integer, Long> countElements(List<Integer> list) {
    list.groupBy { it }.collectEntries { k, v -> [k, v.size() as Long] }
  }

  static Map<Integer, Long> countElements(Integer[] array) {
    Arrays.asList(array).groupBy { it }.collectEntries { k, v -> [k, v.size() as Long] }
  }


  static void main(String[] args) {
    def numbersList = [1, 3, 4, 5, 1, 5, 4]
    def countsList = countElements(numbersList)
    println countsList

    Integer[] numbersArr = [1, 3, 4, 5, 1, 5, 4] as Integer[]
    def countsArr = countElements(numbersArr)
    println countsArr
  }
}
