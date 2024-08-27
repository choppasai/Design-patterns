package Facade.DataAnalysis;

import Facade.DataAnalysis.Model.*;
import Facade.DataAnalysis.Service.AnalysisAlgorithmService;
import Facade.DataAnalysis.Service.DataCollectionService;
import Facade.DataAnalysis.Service.DataPreprocessingService;
import Facade.DataAnalysis.Service.VisualizationService;

public class AnalysisFacade {
    private DataCollectionService dataCollectionService;
    private DataPreprocessingService dataPreprocessingService;
    private AnalysisAlgorithmService analysisAlgorithmService;
    private VisualizationService visualizationService;

    public AnalysisFacade(DataCollectionService dataCollectionService,
                               DataPreprocessingService dataPreprocessingService,
                               AnalysisAlgorithmService analysisAlgorithmService,
                               VisualizationService visualizationService) {
        this.dataCollectionService = dataCollectionService;
        this.dataPreprocessingService = dataPreprocessingService;
        this.analysisAlgorithmService = analysisAlgorithmService;
        this.visualizationService = visualizationService;
    }

    public AnalysisResult performFullAnalysis(DataCollectionParams collectionParams,
                                              PreprocessingOptions preprocessingOptions,
                                              AnalysisAlgorithmConfig algorithmConfig) {
        // Step 1: Collect data
        DataCollectionResult collectionResult = dataCollectionService.collectData(collectionParams);

        // Step 2: Preprocess data
        PreprocessedData preprocessedData = dataPreprocessingService.preprocessData(collectionResult.getData(), preprocessingOptions);

        // Step 3: Apply analysis algorithms
        AnalysisResult analysisResult = analysisAlgorithmService.applyAnalysisAlgorithms(preprocessedData, algorithmConfig);

        // Step 4: Visualize results
        visualizationService.visualizeResults(analysisResult);

        return analysisResult;
    }
}
