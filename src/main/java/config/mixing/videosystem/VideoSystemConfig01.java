package config.mixing.videosystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({DVDConfig.class,DVDPlayerConfig.class})
@ImportResource("classpath:")
public class VideoSystemConfig01 {
	
}
