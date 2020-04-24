//
// Created by zxh on 2020/4/22.
//

#ifndef AUDIOVIDEOLEARNING_MP3_ENCODER_H
#define AUDIOVIDEOLEARNING_MP3_ENCODER_H



class mp3_encoder {
    private:
        FILE* pcmFile;
        FILE* mp3File;
        lame_t lameClient;

    public:
        Mp3Encoder();
        ~Mp3Encoder();
        int Init(const char* pcmFilePath, const char* mp3FilePath, int sampleRate, int channels, int bitRate);
        void Encode();
        void Destroy();
};




#endif //AUDIOVIDEOLEARNING_MP3_ENCODER_H
