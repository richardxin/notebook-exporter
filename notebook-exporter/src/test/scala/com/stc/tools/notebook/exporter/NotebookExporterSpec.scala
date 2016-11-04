/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stc.tools.notebook.exporter

import org.scalatest.FlatSpec

class NotebookExporterSpec  extends FlatSpec {

  it should "generate a valid jar file" in {
    val className = "NotebookApplication.scala"
    val jarName = "generated-application.jar"

    val notebookResource = getClass().getResource("/notebooks/zeppelin/scala-tutorial.json")
    val notebook = ZeppelinNotebook(notebookResource.getPath)
    NotebookExporter.export(notebook, "NotebookApplication.class", "generated-application.jar")

    assert(true)
  }
}