package net.bhl.cdt.reconstruct.cdtliteraturetable.ui.provider;

import cdtliterature.Library;
import org.eclipse.emf.parsley.ui.provider.TableColumnLabelProvider;

@SuppressWarnings("all")
public class CdtliteraturetableTableLabelProvider extends TableColumnLabelProvider {
  public String text_Library_name(final Library it) {
    return "Name";
  }
}
