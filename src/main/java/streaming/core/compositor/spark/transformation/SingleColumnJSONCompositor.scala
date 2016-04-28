package streaming.core.compositor.spark.transformation

import net.sf.json.JSONObject
import streaming.core.compositor.spark.CompositorHelper

/**
 * 4/28/16 WilliamZhu(allwefantasy@gmail.com)
 */
class SingleColumnJSONCompositor[T] extends BaseMapCompositor[T, String, String] with CompositorHelper {

  def name = {
    config("name", _configParams)
  }

  override def map: (String) => String = {
    val _name = name.get
    (line: String) => {
      val res = new JSONObject()
      res.put(_name, line)
      res.toString
    }
  }
}
