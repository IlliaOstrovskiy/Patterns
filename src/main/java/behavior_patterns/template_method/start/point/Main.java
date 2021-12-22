package behavior_patterns.template_method.start.point;

import behavior_patterns.template_method.file_processing.DownloadDoc;
import behavior_patterns.template_method.file_processing.DownloadPdf;
import behavior_patterns.template_method.file_processing.FileDownloader;

public class Main {
    public static void main(String[] args) {
        FileDownloader fileDownloader = new DownloadDoc();
        fileDownloader.downloadFile();

        System.out.println();

        fileDownloader = new DownloadPdf();
        fileDownloader.downloadFile();
    }
}
