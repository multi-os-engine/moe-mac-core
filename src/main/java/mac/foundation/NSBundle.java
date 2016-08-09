/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package mac.foundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;
import mac.appkit.NSImage;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSBundle extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSBundle(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("URLForAuxiliaryExecutable:")
	public native NSURL URLForAuxiliaryExecutable(String executableName);

	@Generated
	@Selector("URLForResource:withExtension:")
	public native NSURL URLForResourceWithExtension(String name, String ext);

	@Generated
	@Selector("URLForResource:withExtension:subdirectory:")
	public native NSURL URLForResourceWithExtensionSubdirectory(String name,
			String ext, String subpath);

	@Generated
	@Selector("URLForResource:withExtension:subdirectory:inBundleWithURL:")
	public static native NSURL URLForResourceWithExtensionSubdirectoryInBundleWithURL(
			String name, String ext, String subpath, NSURL bundleURL);

	@Generated
	@Selector("URLForResource:withExtension:subdirectory:localization:")
	public native NSURL URLForResourceWithExtensionSubdirectoryLocalization(
			String name, String ext, String subpath, String localizationName);

	@Generated
	@Selector("URLsForResourcesWithExtension:subdirectory:")
	public native NSArray URLsForResourcesWithExtensionSubdirectory(String ext,
			String subpath);

	@Generated
	@Selector("URLsForResourcesWithExtension:subdirectory:inBundleWithURL:")
	public static native NSArray URLsForResourcesWithExtensionSubdirectoryInBundleWithURL(
			String ext, String subpath, NSURL bundleURL);

	@Generated
	@Selector("URLsForResourcesWithExtension:subdirectory:localization:")
	public native NSArray URLsForResourcesWithExtensionSubdirectoryLocalization(
			String ext, String subpath, String localizationName);

	@Generated
	@Selector("allBundles")
	public static native NSArray allBundles();

	@Generated
	@Selector("allFrameworks")
	public static native NSArray allFrameworks();

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSBundle alloc();

	@Generated
	@Selector("appStoreReceiptURL")
	public native NSURL appStoreReceiptURL();

	@Generated
	@Selector("builtInPlugInsPath")
	public native String builtInPlugInsPath();

	@Generated
	@Selector("builtInPlugInsURL")
	public native NSURL builtInPlugInsURL();

	@Generated
	@Selector("bundleForClass:")
	public static native NSBundle bundleForClass(Class aClass);

	@Generated
	@Selector("bundleIdentifier")
	public native String bundleIdentifier();

	@Generated
	@Selector("bundlePath")
	public native String bundlePath();

	@Generated
	@Selector("bundleURL")
	public native NSURL bundleURL();

	@Generated
	@Selector("bundleWithIdentifier:")
	public static native NSBundle bundleWithIdentifier(String identifier);

	@Generated
	@Selector("bundleWithPath:")
	public static native NSBundle bundleWithPath(String path);

	@Generated
	@Selector("bundleWithURL:")
	public static native NSBundle bundleWithURL(NSURL url);

	@Generated
	@Selector("classNamed:")
	public native Class classNamed(String className);

	@Generated
	@Selector("developmentLocalization")
	public native String developmentLocalization();

	@Generated
	@Selector("executableArchitectures")
	public native NSArray executableArchitectures();

	@Generated
	@Selector("executablePath")
	public native String executablePath();

	@Generated
	@Selector("executableURL")
	public native NSURL executableURL();

	@Generated
	@Selector("infoDictionary")
	public native NSDictionary infoDictionary();

	@Generated
	@Selector("init")
	public native NSBundle init();

	@Generated
	@Selector("initWithPath:")
	public native NSBundle initWithPath(String path);

	@Generated
	@Selector("initWithURL:")
	public native NSBundle initWithURL(NSURL url);

	@Generated
	@Selector("isLoaded")
	public native boolean isLoaded();

	@Generated
	@Selector("load")
	public native boolean load_objc();

	@Generated
	@Selector("loadAndReturnError:")
	public native boolean loadAndReturnError(Ptr<NSError> error);

	@Generated
	@Selector("localizations")
	public native NSArray localizations();

	@Generated
	@Selector("localizedInfoDictionary")
	public native NSDictionary localizedInfoDictionary();

	@Generated
	@Selector("localizedStringForKey:value:table:")
	public native String localizedStringForKeyValueTable(String key,
			String value, String tableName);

	@Generated
	@Selector("mainBundle")
	public static native NSBundle mainBundle();

	@Generated
	@Selector("objectForInfoDictionaryKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectForInfoDictionaryKey(String key);

	@Generated
	@Selector("pathForAuxiliaryExecutable:")
	public native String pathForAuxiliaryExecutable(String executableName);

	@Generated
	@Selector("pathForResource:ofType:")
	public native String pathForResourceOfType(String name, String ext);

	@Generated
	@Selector("pathForResource:ofType:inDirectory:")
	public static native String pathForResourceOfTypeInDirectory_static(
			String name, String ext, String bundlePath);

	@Generated
	@Selector("pathForResource:ofType:inDirectory:")
	public native String pathForResourceOfTypeInDirectory(String name,
			String ext, String subpath);

	@Generated
	@Selector("pathForResource:ofType:inDirectory:forLocalization:")
	public native String pathForResourceOfTypeInDirectoryForLocalization(
			String name, String ext, String subpath, String localizationName);

	@Generated
	@Selector("pathsForResourcesOfType:inDirectory:")
	public static native NSArray pathsForResourcesOfTypeInDirectory_static(
			String ext, String bundlePath);

	@Generated
	@Selector("pathsForResourcesOfType:inDirectory:")
	public native NSArray pathsForResourcesOfTypeInDirectory(String ext,
			String subpath);

	@Generated
	@Selector("pathsForResourcesOfType:inDirectory:forLocalization:")
	public native NSArray pathsForResourcesOfTypeInDirectoryForLocalization(
			String ext, String subpath, String localizationName);

	@Generated
	@Selector("preferredLocalizations")
	public native NSArray preferredLocalizations();

	@Generated
	@Selector("preferredLocalizationsFromArray:")
	public static native NSArray preferredLocalizationsFromArray(
			NSArray localizationsArray);

	@Generated
	@Selector("preferredLocalizationsFromArray:forPreferences:")
	public static native NSArray preferredLocalizationsFromArrayForPreferences(
			NSArray localizationsArray, NSArray preferencesArray);

	@Generated
	@Selector("preflightAndReturnError:")
	public native boolean preflightAndReturnError(Ptr<NSError> error);

	@Generated
	@Selector("principalClass")
	public native Class principalClass();

	@Generated
	@Selector("privateFrameworksPath")
	public native String privateFrameworksPath();

	@Generated
	@Selector("privateFrameworksURL")
	public native NSURL privateFrameworksURL();

	@Generated
	@Selector("resourcePath")
	public native String resourcePath();

	@Generated
	@Selector("resourceURL")
	public native NSURL resourceURL();

	@Generated
	@Selector("sharedFrameworksPath")
	public native String sharedFrameworksPath();

	@Generated
	@Selector("sharedFrameworksURL")
	public native NSURL sharedFrameworksURL();

	@Generated
	@Selector("sharedSupportPath")
	public native String sharedSupportPath();

	@Generated
	@Selector("sharedSupportURL")
	public native NSURL sharedSupportURL();

	@Generated
	@Selector("unload")
	public native boolean unload();

	@Generated
	@Selector("URLForImageResource:")
	public native NSURL URLForImageResource(String name);

	@Generated
	@Selector("contextHelpForKey:")
	public native NSAttributedString contextHelpForKey(String key);

	@Generated
	@Selector("imageForResource:")
	public native NSImage imageForResource(String name);

	@Generated
	@Selector("loadNibFile:externalNameTable:withZone:")
	public static native boolean loadNibFileExternalNameTableWithZone_static(
			String fileName, NSDictionary context, VoidPtr zone);

	@Generated
	@Selector("loadNibFile:externalNameTable:withZone:")
	public native boolean loadNibFileExternalNameTableWithZone(String fileName,
			NSDictionary context, VoidPtr zone);

	@Generated
	@Selector("loadNibNamed:owner:")
	public static native boolean loadNibNamedOwner(String nibName,
			@Mapped(ObjCObjectMapper.class) Object owner);

	@Generated
	@Selector("loadNibNamed:owner:topLevelObjects:")
	public native boolean loadNibNamedOwnerTopLevelObjects(String nibName,
			@Mapped(ObjCObjectMapper.class) Object owner,
			Ptr<NSArray> topLevelObjects);

	@Generated
	@Selector("pathForImageResource:")
	public native String pathForImageResource(String name);

	@Generated
	@Selector("pathForSoundResource:")
	public native String pathForSoundResource(String name);
}
