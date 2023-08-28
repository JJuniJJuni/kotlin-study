object Util {
  fun numberOfProcessors() = Runtime.getRuntime().availableProcessors()
}

println(Util.numberOfProcessors()) // 8, 내 맥북은 10으로 나옴
