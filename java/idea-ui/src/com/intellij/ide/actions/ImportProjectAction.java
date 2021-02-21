/*
 * Copyright 2000-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.ide.actions;

import com.intellij.icons.AllIcons;
import com.intellij.ide.JavaUiBundle;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.wm.impl.welcomeScreen.NewWelcomeScreen;
import org.jetbrains.annotations.NotNull;

/**
 * @author Dmitry Avdeev
 */
public class ImportProjectAction extends ImportModuleAction {
  @Override
  public void actionPerformed(@NotNull AnActionEvent e) {
   doImport(null);
  }

  @Override
  public void update(@NotNull AnActionEvent e) {
    if (NewWelcomeScreen.isNewWelcomeScreen(e)) {
      e.getPresentation().setIcon(AllIcons.ToolbarDecorator.Import);
    }
    NewProjectAction.updateActionText(this, e);
  }

  @NotNull
  @Override
  public String getActionText(boolean isInNewSubmenu, boolean isInJavaIde) {
    return JavaUiBundle.message("import.project.action.text", isInNewSubmenu ? 1 : 0, isInJavaIde ? 1 : 0);
  }
}