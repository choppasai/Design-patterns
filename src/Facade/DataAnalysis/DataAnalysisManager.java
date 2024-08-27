package Facade.DataAnalysis;

import Facade.DataAnalysis.Model.*;
import Facade.DataAnalysis.Service.*;

public class DataAnalysisManager {
    private AnalysisFacade analysisFacade;

    public DataAnalysisManager(DataCollectionService dataCollectionService,
                               DataPreprocessingService dataPreprocessingService,
                               AnalysisAlgorithmService analysisAlgorithmService,
                               VisualizationService visualizationService){
        analysisFacade = new AnalysisFacade(dataCollectionService, dataPreprocessingService, analysisAlgorithmService, visualizationService);
    }
    public AnalysisResult fullAnalysis(DataCollectionParams collectionParams,
                                       PreprocessingOptions preprocessingOptions,
                                       AnalysisAlgorithmConfig algorithmConfig){
        return analysisFacade.performFullAnalysis(collectionParams,preprocessingOptions,algorithmConfig);
    }
}
