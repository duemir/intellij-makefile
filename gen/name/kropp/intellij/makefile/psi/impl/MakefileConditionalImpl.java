// This is a generated file. Not intended for manual editing.
package name.kropp.intellij.makefile.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import name.kropp.intellij.makefile.psi.MakefileBlock;
import name.kropp.intellij.makefile.psi.MakefileCondition;
import name.kropp.intellij.makefile.psi.MakefileConditional;
import name.kropp.intellij.makefile.psi.MakefileVisitor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MakefileConditionalImpl extends ASTWrapperPsiElement implements MakefileConditional {

  public MakefileConditionalImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MakefileVisitor visitor) {
    visitor.visitConditional(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MakefileVisitor) accept((MakefileVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<MakefileBlock> getBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MakefileBlock.class);
  }

  @Override
  @NotNull
  public List<MakefileCondition> getConditionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, MakefileCondition.class);
  }

}
