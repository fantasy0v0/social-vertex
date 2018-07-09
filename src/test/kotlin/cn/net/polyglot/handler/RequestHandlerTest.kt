package cn.net.polyglot.handler

import cn.net.polyglot.testframework.shouldBe
import io.vertx.core.json.JsonObject
import org.junit.Test

/**
 * @author zxj5470
 * @date 2018/7/9
 */
class RequestHandlerTest{
  @Test
  fun testFromString(){
    val str ="""{"type":"search"}"""
    val json = JsonObject(str)
    val ret = handle(json)
    ret shouldBe """{"type":"search","action":"response","user":"null"}"""
  }
}