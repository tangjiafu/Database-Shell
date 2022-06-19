package org.database.shell.command

/**
 *
 *
 * @author Lager.Tang
 *         create: 2022-06-19 09:21
 * */

trait DatasourceSupportSpi {
  def datasource(): String

}
