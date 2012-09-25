package org.pitest.mutationtest.report;

import java.io.File;


public class UndatedReportDirCreationStrategy implements
    ReportDirCreationStrategy {

  public File createReportDir(final String base) {
    final File reportDir = new File(base);
    reportDir.mkdirs();
    return reportDir;
  }

}
