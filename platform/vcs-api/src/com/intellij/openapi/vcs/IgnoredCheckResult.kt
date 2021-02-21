// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.openapi.vcs

import java.io.File

sealed class IgnoredCheckResult
data class Ignored(val ignoreFile: File, val matchedPattern: String): IgnoredCheckResult()
object NotIgnored : IgnoredCheckResult()