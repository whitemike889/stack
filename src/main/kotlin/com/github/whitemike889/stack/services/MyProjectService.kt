package com.github.whitemike889.stack.services

import com.intellij.openapi.project.Project
import com.github.whitemike889.stack.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
