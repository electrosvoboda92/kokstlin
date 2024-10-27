fun main() {
    val hwTimeTest = mapOf("Test 1" to 0.089, "Test 2" to 1.1, "Test 3" to 0.9)
    val avg = hwTimeTest.values.average()
    println("Task 1 $avg")

    val hwMetaDataTest = mapOf(
        "testButton" to "User tap button1",
        "testBanner" to "User closed banner",
        "activateCert" to "User activate cert"
    )

    println("Task 2 ${hwTimeTest.keys}")

    val hwMutableTest = mutableMapOf(
        "testButton" to "done",
        "testBanner" to "done",
        "activateCert" to "error"
    )

    hwMutableTest["testProgramm"] = "done"
    println("Task 3 ${hwMutableTest}")

    val countSuccessTest = hwMutableTest.count { it.value.contains("done") }
    println("Task 4 ${countSuccessTest}")

    val listTasks = mutableMapOf(
        "Task-1" to "in Progress",
        "Task-2" to "To Do",
        "Task-3" to "Done"
    )
    listTasks.remove("Task-3")
    println("Task 5 ${listTasks}")

    val testWebSites = mapOf(
        "/platon/login/" to 200,
        "/platon/orders/createorder" to 404,
        "platon/order/orderitem" to 500
    )
    testWebSites.forEach { (url, statusCode) ->
        println("Task 6 url=${url} status code = ${statusCode}")

    }

    val testResult = hwTimeTest.filter { it.value < 1.0 }
    println("Task 7: ${testResult}")

    val testApi = mapOf(
        "/api/v2/create" to 201,
        "/api/v2/cancel" to 200,
        "/api/v2/status" to 200
    )
    val result1 = testApi.getOrElse("/api/v2/status") { throw IllegalArgumentException() }
    val result2 = testApi.getOrDefault("/api/v2/statusOrder", "No run")
    println("Task 8 status test $result1 status test $result2")


    val config = mapOf(
        "Auth" to "Bearer",
        "Browser" to "Chrome",
        "Lang" to "Eng"
    )
    val resultGet = config.getOrDefault("browserType", "")
    println("Task 9 $resultGet")


    val versions = mapOf(
        "Mobile App" to 1.0023,
        "Platon" to 0.89914,
        "Thales" to 1.1
    )
    val newVersions = versions + ("Core" to 2.389)
    println("Task 10 $newVersions")


    val configModels = mapOf(
        "Samsung A 52" to "flag 303 - On",
        "IPhone 12 mini" to "flag 303 - On",
        "Pixel 4a" to "flag 303 - Off",

        )
    val configDef = configModels.getOrDefault("IPhone 14 Pro Max", "flag 303 - Off")
    println("Task 11 $configDef")

    val checkErrors = mapOf(
        200 to "success",
        201 to "create",
        400 to "Bad request",
        404 to "Not found"
    )

    val checkCode = checkErrors.all { it.key == 500 }
    println("Task 12 $checkCode")

    val listTestComplite = mapOf(
        "Test100_Version1" to "Passed",
        "Test101_Version2" to "Passed",
        "Test102_Version2" to "Passed",
        "Test103_Version2" to "Skipped",
        "Test104_Version4" to "Passed",
        "Test105_Version4" to "Failed",
        "Test106_Version4" to "Failed"
    )

    val specialList = listTestComplite.filter { it.key.contains("Version4") }
    println("Task 13 $specialList")

    val funcModels = mapOf(
        "auth" to "passed",
        "login" to "skipped",
        "main" to "failed",
        "map" to "failed"
    )
    val listFailTests = funcModels.filterNot { it.value.contains("passed") }
    println("Task 14 $listFailTests")

    val configTestStage = mutableMapOf(
        "postgreSQL" to 1.251,
        "Rabbit" to 2.089,
        "Kafka" to 1.1,
        "Python" to 3.10
    )

    configTestStage.putAll(mapOf("IOS" to 18.1))
    println("task 15 $configTestStage")

    val mapTestResult1 = mapOf(
        "ADARA-15" to "Fix",
        "ADARA-19" to "Fix",
        "ADARA-20" to "In Progress",
        "ADARA-24" to "To Do"
    )

    val mapTestResult2 = mapOf(
        "DEL-24" to "Fix",
        "DEL-192" to "To Do",
        "DEL-40" to "In Progress",
        "DEL-34" to "To Do"
    )
    val allBags = mapTestResult1 + mapTestResult2
    println("Task 16 $allBags")


    val timeTest = mutableMapOf(
        "Test 1" to 0.089,
        "Test 2" to 1.1,
        "Test 3" to 0.9
    )
    timeTest.clear()
    println("Task 17 $timeTest")

    val onlylistTestComplite = listTestComplite.filterNot { it.value.contains("Skipped") }
    println("Task 18 $onlylistTestComplite")

    val configTest = mutableMapOf(
        "postgreSQL" to 1.251,
        "Rabbit" to 2.089,
        "Kafka" to 1.1,
        "Python" to 3.10
    )
    configTest.remove("Python")
    println("Task 19 $configTest")

    val resultTest = mapOf(
        "ADARA-309" to "Done",
        "ADARA-310" to "Done",
        "ADARA-311" to "Done",
        "ADARA-312" to "Done"
    )
    println(
        "Task 20 ${
            resultTest.map {
                "${it.key} : ${it.value}"
            }
        }"
    )

    val resultTestPast = mutableMapOf(
        "ADARA-309" to "Done",
        "ADARA-310" to "Done",
        "ADARA-311" to "Done",
        "ADARA-312" to "Done"
    )

    val archiveTest = resultTestPast.toMap()
    println("Task 21 $archiveTest")

    val timeTestResult = mutableMapOf(
        "ADARA-309" to 5.0,
        "ADARA-310" to 12.1,
        "ADARA-311" to 7.3,
        "ADARA-312" to 4.4
    )


    fun changeTaskName(id: String):String {
        return when(id){
            "ADARA-309" -> "getNewAddress()"
            "ADARA-310" -> "creatClientPhone()"
            "ADARA-311" -> "kostil()"
            "ADARA-312" -> "kostilOpyat()"
            else -> {""}
        }
    }
    println("Task 22 ${timeTestResult.mapKeys { changeTaskName(it.key) }}")


    val scoreTestResult = mutableMapOf(
        "ADARA-309" to 10,
        "ADARA-310" to 8,
        "ADARA-311" to 7,
        "ADARA-312" to 6
    )

    val newScore = scoreTestResult.mapValues { it.value + (it.value * 0.1) }
    println("Task 23 $newScore")

    val compilationResult = mutableMapOf(
        "ADARA-309" to "Done",
        "ADARA-310" to "Done",
        "ADARA-311" to "Done",
        "ADARA-312" to "Done",
        "ADARA-313" to null,

        )
    println("Task 24 ${compilationResult.isEmpty()}")

    val nagrResult = mutableMapOf(
        "INT-309" to "Done",
        "INT-310" to "Done"
    )
    println("Task 25 ${nagrResult.isNotEmpty()}")

    println("Task 26 ${compilationResult.all { it.value == "Done" }}")

    println("Task 27 ${listTestComplite.any { it.value == "Failed" }}")


    val listTestCompliteServises = mapOf(
        "Platon" to "Passed",
        "Homer" to "Passed",
        "Thales" to "Passed",
        "Buktop" to "Skipped",
        "MobApp" to "Passed",
        "Socrates" to "Failed",
        "optional" to "Failed"
    )
    println("Task 28 ${
        listTestCompliteServises
            .filterNot {
                it.value == "Passed"
            }.filterKeys { it.contains("optional")
            }
    }")

}