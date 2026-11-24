package org.jabref.logic.openoffice.style;

<<<<<<< HEAD
public interface OOStyle {
=======
import org.jabref.logic.citationstyle.CitationStyle;
import org.jabref.logic.openoffice.bst.BstStyle;
import org.jabref.logic.openoffice.jstyle.JStyle;

public sealed interface OOStyle permits CitationStyle, JStyle, BstStyle {
>>>>>>> ecb8ff76cb (OpenOffice Backend re-architecture B - Package reorganization (#17918))
    String getName();

    boolean isInternalStyle();

    String getPath();
}
