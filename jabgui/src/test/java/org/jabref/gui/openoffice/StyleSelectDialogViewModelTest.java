package org.jabref.gui.openoffice;

<<<<<<< HEAD
=======
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

import javafx.scene.control.Tab;
import javafx.stage.FileChooser.ExtensionFilter;

import org.jabref.gui.DialogService;
import org.jabref.gui.frame.ExternalApplicationsPreferences;
import org.jabref.gui.preferences.GuiPreferences;
import org.jabref.gui.util.FileDialogConfiguration;
import org.jabref.logic.FilePreferences;
import org.jabref.logic.citationstyle.CSLStyleLoader;
import org.jabref.logic.citationstyle.CitationStyle;
import org.jabref.logic.journals.JournalAbbreviationRepository;
import org.jabref.logic.l10n.Localization;
import org.jabref.logic.layout.LayoutFormatterPreferences;
import org.jabref.logic.openoffice.OpenOfficePreferences;
import org.jabref.logic.openoffice.bst.BstStyle;
import org.jabref.logic.openoffice.bst.BstStyleLoader;
import org.jabref.logic.openoffice.jstyle.JStyle;
import org.jabref.logic.openoffice.jstyle.JStyleLoader;
import org.jabref.logic.openoffice.style.OOStyle;
import org.jabref.logic.preview.CitationStylePreviewLayout;
import org.jabref.logic.util.CurrentThreadTaskExecutor;
import org.jabref.logic.util.StandardFileType;
import org.jabref.logic.util.TaskExecutor;
import org.jabref.model.entry.BibEntryTypesManager;

>>>>>>> ecb8ff76cb (OpenOffice Backend re-architecture B - Package reorganization (#17918))
import org.jspecify.annotations.NullMarked;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@NullMarked
class StyleSelectDialogViewModelTest {

    @Test
    void matchStyleSearchIgnoresPunctuationSeparators() {
        assertTrue(StyleSelectDialogViewModel.matchStyleSearch(
                "Springer - Lecture Notes in Computer Science",
                "springer "));
    }

    @Test
    void matchStyleSearchFindsCapitalizedSubsetTerms() {
        assertTrue(StyleSelectDialogViewModel.matchStyleSearch(
                "Springer - Lecture Notes in Computer Science",
                "Springer lecture"));
    }

    @Test
    void matchStyleSearchKeepsUnmatchedTermsHidden() {
        assertFalse(StyleSelectDialogViewModel.matchStyleSearch(
                "Springer - Lecture Notes in Computer Science",
                "springer medicine"));
    }
}
