package net.dbs.sb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistration;

import ch.rasc.wampspring.config.EnableWamp;
import ch.rasc.wampspring.config.WampConfigurerAdapter;

@Configuration
@EnableWamp
@EnableAsync
@EnableScheduling
public class WebSocketConfig extends WampConfigurerAdapter {

	@Override
	public void configureWampWebsocketHandler(WebSocketHandlerRegistration reg) {
		reg.withSockJS();
	}

    /* (non-Javadoc)
     * @see ch.rasc.wampspring.config.WampConfigurerAdapter#pathMatcher()
     */
    @Override
    public PathMatcher pathMatcher() {
        AntPathMatcher matcher = new AntPathMatcher();
        //matcher.setPathSeparator(".");
        return matcher;
    }

}
