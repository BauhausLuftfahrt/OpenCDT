package net.bhl.cdt.core.pref;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.InvalidPropertiesFormatException;
import java.util.Optional;
import java.util.Properties;

import javax.inject.Inject;

import net.bhl.cdt.log.service.CDTLogService;
import net.bhl.cdt.util.CDTFileAndFolderUtil;
import net.bhl.cdt.util.constants.FileConstants;
import net.bhl.cdt.util.constants.StringConstants;

/**
 * 
 * @author Michael Shamiyeh
 * @since 2017-06-26
 *
 */
public class CDTPreferencesService {
	private File cdtPreferencesFile = new File(CDTFileAndFolderUtil.getCDTWorkPathString() + StringConstants.BACKSLASH + FileConstants.CDT_SETTINGSFILE);
	
	private Properties properties = new Properties();
	
	@Inject
	CDTLogService logService;
	
	public CDTPreferencesService() {
	}
	
	public void initialize() {
		try {
			logService.info("Initialize CDT Preferences Service...");
			
			if (!cdtPreferencesFile.exists()) {
				cdtPreferencesFile.createNewFile();
				logService.info("Settings file created: '" + cdtPreferencesFile.getAbsolutePath() + "'");
			}
			else {
				InputStream inputStream = new FileInputStream(cdtPreferencesFile);
				properties.loadFromXML(inputStream);
				logService.info("Read settings file: " + properties.size() + " setting(s) loaded.");
			}
			
			logService.info("Successfully completed.");
		} catch (FileNotFoundException e) {
			logService.error("CDT settings file not found.");
			e.printStackTrace();
		} catch (InvalidPropertiesFormatException e) {
			logService.error("CDT settings file corrupted.");
			e.printStackTrace();
		} catch (IOException e) {
			logService.error("CDT settings file reading error.");
			e.printStackTrace();
		}
	}
	
	public void save() {
		try {
			logService.info("Save CDT Preferences...");
			
			OutputStream outStream = new FileOutputStream(cdtPreferencesFile);
			properties.storeToXML(outStream, StringConstants.EMPTY);
			
			logService.info("Successfully completed.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Optional<String> getPreference(String key) {
		if (properties.containsKey(key))
			return Optional.of(properties.getProperty(key));
		
		return Optional.empty();
	}
	
	public Optional<Boolean> getBooleanPreference(String key) {
		if (properties.containsKey(key))
			return Optional.of(Boolean.parseBoolean((String)properties.get(key)));

		return Optional.empty();
	}
	
	public void setPreference(String key, String value) {
		properties.put(key, value);
	}
}
