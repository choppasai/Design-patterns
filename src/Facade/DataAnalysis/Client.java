package Facade.DataAnalysis;

import Facade.DataAnalysis.Model.AnalysisAlgorithmConfig;
import Facade.DataAnalysis.Model.AnalysisResult;
import Facade.DataAnalysis.Model.DataCollectionParams;
import Facade.DataAnalysis.Model.PreprocessingOptions;
import Facade.DataAnalysis.Service.AnalysisAlgorithmService;
import Facade.DataAnalysis.Service.DataCollectionService;
import Facade.DataAnalysis.Service.DataPreprocessingService;
import Facade.DataAnalysis.Service.VisualizationService;

public class Client {
    public static void main(String[] args){
        DataCollectionService dataCollectionService = new DataCollectionService();
        DataPreprocessingService dataPreprocessingService = new DataPreprocessingService();
        AnalysisAlgorithmService analysisAlgorithmService = new AnalysisAlgorithmService();
        VisualizationService visualizationService = new VisualizationService();
        DataAnalysisManager dataAnalysisManager = new DataAnalysisManager(dataCollectionService,
                                    dataPreprocessingService,analysisAlgorithmService,
                                    visualizationService);
        DataCollectionParams dataCollectionParams = new DataCollectionParams();
        PreprocessingOptions preprocessingOptions = new PreprocessingOptions();
        AnalysisAlgorithmConfig algorithmConfig = new AnalysisAlgorithmConfig();
        AnalysisResult result =  dataAnalysisManager.fullAnalysis(dataCollectionParams, preprocessingOptions,
                 algorithmConfig);
    }
}
