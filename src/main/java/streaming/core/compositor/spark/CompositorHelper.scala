package streaming.core.compositor.spark

import java.util
import scala.collection.JavaConversions._

/**
 * 4/28/16 WilliamZhu(allwefantasy@gmail.com)
 */
trait CompositorHelper {

  def config(name: String, _configParams: util.List[util.Map[Any, Any]]) = {
    if (_configParams.size() > 0 && _configParams(0).containsKey(name)) {
      Some(_configParams(0).get(name).asInstanceOf[String])
    } else None
  }

}
