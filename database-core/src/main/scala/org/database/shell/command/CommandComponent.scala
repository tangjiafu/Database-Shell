package org.database.shell.command

import org.database.shell.command.CommandComponent.{datasource, datasourceMap}
import org.springframework.shell.standard.{ShellComponent, ShellMethod}

/**
 *
 *
 * @author Lager.Tang
 *         create: 2022-06-19 02:00
 * */
@ShellComponent
class CommandComponent() {


  @ShellMethod("hello world")
  def hello(): String = {
    "hello"
  }

  @ShellMethod("hello world")
  def now(): String = {
    datasource.datasource()
  }

  @ShellMethod("hello world")
  def use(_type: String): String = {
    datasource = datasourceMap(_type)
    datasource.toString
  }
}


object CommandComponent {
  //  private val datasourceMap: Map[String, DatasourceSupportSpi] = ServiceLoader.load(classOf[DatasourceSupportSpi]).asScala
  //    .map(a => (a.datasource(), a))
  //    .toMap

  /**
   * 数据源列表
   */
  private val datasourceMap: Map[String, DatasourceSupportSpi] = Map()
  private var datasource: DatasourceSupportSpi = _

}
