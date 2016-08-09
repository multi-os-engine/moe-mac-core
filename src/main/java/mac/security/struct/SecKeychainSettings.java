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

package mac.security.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class SecKeychainSettings extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public SecKeychainSettings() {
		super(SecKeychainSettings.class);
	}

	@Generated
	protected SecKeychainSettings(Pointer peer) {
		super(peer);
	}

	@Generated
	public SecKeychainSettings(int version, byte lockOnSleep,
			byte useLockInterval, int lockInterval) {
		super(SecKeychainSettings.class);
		setVersion(version);
		setLockOnSleep(lockOnSleep);
		setUseLockInterval(useLockInterval);
		setLockInterval(lockInterval);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setVersion(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native byte lockOnSleep();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setLockOnSleep(byte value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native byte useLockInterval();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setUseLockInterval(byte value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int lockInterval();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setLockInterval(int value);
}
