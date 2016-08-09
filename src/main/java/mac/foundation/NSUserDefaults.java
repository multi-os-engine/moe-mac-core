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
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSUserDefaults extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSUserDefaults(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("URLForKey:")
	public native NSURL URLForKey(String defaultName);

	@Generated
	@Selector("addSuiteNamed:")
	public native void addSuiteNamed(String suiteName);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSUserDefaults alloc();

	@Generated
	@Selector("arrayForKey:")
	public native NSArray arrayForKey(String defaultName);

	@Generated
	@Selector("boolForKey:")
	public native boolean boolForKey(String defaultName);

	@Generated
	@Selector("dataForKey:")
	public native NSData dataForKey(String defaultName);

	@Generated
	@Selector("dictionaryForKey:")
	public native NSDictionary dictionaryForKey(String defaultName);

	@Generated
	@Selector("dictionaryRepresentation")
	public native NSDictionary dictionaryRepresentation();

	@Generated
	@Selector("doubleForKey:")
	public native double doubleForKey(String defaultName);

	@Generated
	@Selector("floatForKey:")
	public native float floatForKey(String defaultName);

	@Generated
	@Selector("init")
	public native NSUserDefaults init();

	@Generated
	@Selector("initWithSuiteName:")
	public native NSUserDefaults initWithSuiteName(String suitename);

	@Generated
	@Selector("initWithUser:")
	public native NSUserDefaults initWithUser(String username);

	@Generated
	@Selector("integerForKey:")
	public native long integerForKey(String defaultName);

	@Generated
	@Selector("objectForKey:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object objectForKey(String defaultName);

	@Generated
	@Selector("objectIsForcedForKey:")
	public native boolean objectIsForcedForKey(String key);

	@Generated
	@Selector("objectIsForcedForKey:inDomain:")
	public native boolean objectIsForcedForKeyInDomain(String key, String domain);

	@Generated
	@Selector("persistentDomainForName:")
	public native NSDictionary persistentDomainForName(String domainName);

	@Generated
	@Selector("persistentDomainNames")
	public native NSArray persistentDomainNames();

	@Generated
	@Selector("registerDefaults:")
	public native void registerDefaults(NSDictionary registrationDictionary);

	@Generated
	@Selector("removeObjectForKey:")
	public native void removeObjectForKey(String defaultName);

	@Generated
	@Selector("removePersistentDomainForName:")
	public native void removePersistentDomainForName(String domainName);

	@Generated
	@Selector("removeSuiteNamed:")
	public native void removeSuiteNamed(String suiteName);

	@Generated
	@Selector("removeVolatileDomainForName:")
	public native void removeVolatileDomainForName(String domainName);

	@Generated
	@Selector("resetStandardUserDefaults")
	public static native void resetStandardUserDefaults();

	@Generated
	@Selector("setBool:forKey:")
	public native void setBoolForKey(boolean value, String defaultName);

	@Generated
	@Selector("setDouble:forKey:")
	public native void setDoubleForKey(double value, String defaultName);

	@Generated
	@Selector("setFloat:forKey:")
	public native void setFloatForKey(float value, String defaultName);

	@Generated
	@Selector("setInteger:forKey:")
	public native void setIntegerForKey(long value, String defaultName);

	@Generated
	@Selector("setObject:forKey:")
	public native void setObjectForKey(
			@Mapped(ObjCObjectMapper.class) Object value, String defaultName);

	@Generated
	@Selector("setPersistentDomain:forName:")
	public native void setPersistentDomainForName(NSDictionary domain,
			String domainName);

	@Generated
	@Selector("setURL:forKey:")
	public native void setURLForKey(NSURL url, String defaultName);

	@Generated
	@Selector("setVolatileDomain:forName:")
	public native void setVolatileDomainForName(NSDictionary domain,
			String domainName);

	@Generated
	@Selector("standardUserDefaults")
	public static native NSUserDefaults standardUserDefaults();

	@Generated
	@Selector("stringArrayForKey:")
	public native NSArray stringArrayForKey(String defaultName);

	@Generated
	@Selector("stringForKey:")
	public native String stringForKey(String defaultName);

	@Generated
	@Selector("synchronize")
	public native boolean synchronize();

	@Generated
	@Selector("volatileDomainForName:")
	public native NSDictionary volatileDomainForName(String domainName);

	@Generated
	@Selector("volatileDomainNames")
	public native NSArray volatileDomainNames();
}
