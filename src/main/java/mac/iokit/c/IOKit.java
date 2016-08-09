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

package mac.iokit.c;


import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.*;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.corefoundation.opaque.*;
import mac.iokit.opaque.IONotificationPortRef;
import mac.struct.mach_msg_header_t;
import mac.struct.mach_timespec;

@Generated
@Library("IOKit")
@Runtime(CRuntime.class)
public final class IOKit {
	static {
		NatJ.register();
	}

	@Generated
	private IOKit() {
	}

	@Generated
	@CFunction
	public static native int IOMasterPort(int bootstrapPort, IntPtr masterPort);

	@Generated
	@CFunction
	public static native IONotificationPortRef IONotificationPortCreate(
			int masterPort);

	@Generated
	@CFunction
	public static native void IONotificationPortDestroy(
			IONotificationPortRef notify_);

	@Generated
	@CFunction
	public static native CFRunLoopSourceRef IONotificationPortGetRunLoopSource(
			IONotificationPortRef notify_);

	@Generated
	@CFunction
	public static native int IONotificationPortGetMachPort(
			IONotificationPortRef notify_);

	@Generated
	@CFunction
	public static native void IONotificationPortSetDispatchQueue(
			IONotificationPortRef notify_,
			@Mapped(ObjCObjectMapper.class) Object queue);

	@Generated
	@CFunction
	public static native void IODispatchCalloutFromMessage(
			VoidPtr unused,
			@UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t msg,
			VoidPtr reference);

	@Generated
	@CFunction
	public static native int IOCreateReceivePort(int msgType, IntPtr recvPort);

	@Generated
	@CFunction
	public static native int IOObjectRelease(int object);

	@Generated
	@CFunction
	public static native int IOObjectRetain(int object);

	@Generated
	@CFunction
	public static native int IOObjectIsEqualTo(int object, int anObject);

	@Generated
	@CFunction
	public static native int IOObjectGetRetainCount(int object);

	@Generated
	@CFunction
	public static native int IOIteratorNext(int iterator);

	@Generated
	@CFunction
	public static native void IOIteratorReset(int iterator);

	@Generated
	@CFunction
	public static native int IOIteratorIsValid(int iterator);

	@Generated
	@CFunction
	public static native int IOServiceGetMatchingService(int masterPort,
			CFDictionaryRef matching);

	@Generated
	@CFunction
	public static native int IOServiceGetMatchingServices(int masterPort,
			CFDictionaryRef matching, IntPtr existing);

	@Generated
	@CFunction
	public static native int IOServiceMatchPropertyTable(int service,
			CFDictionaryRef matching, IntPtr matches);

	@Generated
	@CFunction
	public static native int IOServiceGetBusyState(int service, IntPtr busyState);

	@Generated
	@CFunction
	public static native int IOServiceWaitQuiet(
			int service,
			@UncertainArgument("Options: reference, array Fallback: reference") mach_timespec waitTime);

	@Generated
	@CFunction
	public static native int IOKitGetBusyState(int masterPort, IntPtr busyState);

	@Generated
	@CFunction
	public static native int IOKitWaitQuiet(
			int masterPort,
			@UncertainArgument("Options: reference, array Fallback: reference") mach_timespec waitTime);

	@Generated
	@CFunction
	public static native int IOServiceOpen(int service, int owningTask,
			int type, IntPtr connect);

	@Generated
	@CFunction
	public static native int IOServiceRequestProbe(int service, int options);

	@Generated
	@CFunction
	public static native int IOServiceClose(int connect);

	@Generated
	@CFunction
	public static native int IOConnectAddRef(int connect);

	@Generated
	@CFunction
	public static native int IOConnectRelease(int connect);

	@Generated
	@CFunction
	public static native int IOConnectGetService(int connect, IntPtr service);

	@Generated
	@CFunction
	public static native int IOConnectSetNotificationPort(int connect,
			int type, int port, long reference);

	@Generated
	@CFunction
	public static native int IOConnectMapMemory(int connect, int memoryType,
			int intoTask, LongPtr atAddress, LongPtr ofSize, int options);

	@Generated
	@CFunction
	public static native int IOConnectMapMemory64(int connect, int memoryType,
			int intoTask, LongPtr atAddress, LongPtr ofSize, int options);

	@Generated
	@CFunction
	public static native int IOConnectUnmapMemory(int connect, int memoryType,
			int fromTask, long atAddress);

	@Generated
	@CFunction
	public static native int IOConnectUnmapMemory64(int connect,
			int memoryType, int fromTask, long atAddress);

	@Generated
	@CFunction
	public static native int IOConnectSetCFProperties(int connect,
			ConstVoidPtr properties);

	@Generated
	@CFunction
	public static native int IOConnectSetCFProperty(int connect,
			CFStringRef propertyName, ConstVoidPtr property);

	@Generated
	@CFunction
	public static native int IOConnectTrap0(int connect, int index);

	@Generated
	@CFunction
	public static native int IOConnectTrap1(int connect, int index, long p1);

	@Generated
	@CFunction
	public static native int IOConnectTrap2(int connect, int index, long p1,
			long p2);

	@Generated
	@CFunction
	public static native int IOConnectTrap3(int connect, int index, long p1,
			long p2, long p3);

	@Generated
	@CFunction
	public static native int IOConnectTrap4(int connect, int index, long p1,
			long p2, long p3, long p4);

	@Generated
	@CFunction
	public static native int IOConnectTrap5(int connect, int index, long p1,
			long p2, long p3, long p4, long p5);

	@Generated
	@CFunction
	public static native int IOConnectTrap6(int connect, int index, long p1,
			long p2, long p3, long p4, long p5, long p6);

	@Generated
	@CFunction
	public static native int IOConnectAddClient(int connect, int client);

	@Generated
	@CFunction
	public static native int IORegistryGetRootEntry(int masterPort);

	@Generated
	@CFunction
	public static native int IORegistryIteratorEnterEntry(int iterator);

	@Generated
	@CFunction
	public static native int IORegistryIteratorExitEntry(int iterator);

	@Generated
	@CFunction
	public static native int IORegistryEntryGetRegistryEntryID(int entry,
			LongPtr entryID);

	@Generated
	@CFunction
	public static native int IORegistryEntryCreateCFProperties(int entry,
			Ptr<CFMutableDictionaryRef> properties, CFAllocatorRef allocator,
			int options);

	@Generated
	@CFunction
	public static native ConstVoidPtr IORegistryEntryCreateCFProperty(
			int entry, CFStringRef key, CFAllocatorRef allocator, int options);

	@Generated
	@CFunction
	public static native int IORegistryEntrySetCFProperties(int entry,
			ConstVoidPtr properties);

	@Generated
	@CFunction
	public static native int IORegistryEntrySetCFProperty(int entry,
			CFStringRef propertyName, ConstVoidPtr property);

	@Generated
	@CFunction
	public static native CFMutableDictionaryRef IOServiceMatching(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

	@Generated
	@CFunction
	public static native CFMutableDictionaryRef IOServiceNameMatching(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

	@Generated
	@CFunction
	public static native CFMutableDictionaryRef IOBSDNameMatching(
			int masterPort,
			int options,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String bsdName);

	@Generated
	@Deprecated
	@CFunction
	public static native CFMutableDictionaryRef IOOpenFirmwarePathMatching(
			int masterPort,
			int options,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String path);

	@Generated
	@CFunction
	public static native CFMutableDictionaryRef IORegistryEntryIDMatching(
			long entryID);

	@Generated
	@CFunction
	public static native int OSGetNotificationFromMessage(
			@UncertainArgument("Options: reference, array Fallback: reference") mach_msg_header_t msg,
			int index, IntPtr type, LongPtr reference, Ptr<VoidPtr> content,
			LongPtr size);

	@Generated
	@CFunction
	public static native int IOCatalogueSendData(
			int masterPort,
			int flag,
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String buffer,
			int size);

	@Generated
	@CFunction
	public static native int IOCatalogueGetData(int masterPort, int flag,
			Ptr<BytePtr> buffer, IntPtr size);

	@Generated
	@CFunction
	public static native int IOCatalogueReset(int masterPort, int flag);

	@Generated
	@CVariable()
	public static native int kIOMasterPortDefault();
}
