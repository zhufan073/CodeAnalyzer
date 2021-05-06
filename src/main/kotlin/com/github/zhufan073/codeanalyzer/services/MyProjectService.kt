package com.github.zhufan073.codeanalyzer.services

import com.github.zhufan073.codeanalyzer.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
