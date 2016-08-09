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


import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSOutputStream extends NSStream {
	static {
		NatJ.register();
	}

	@Generated
	protected NSOutputStream(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSOutputStream alloc();

	@Generated
	@Selector("hasSpaceAvailable")
	public native boolean hasSpaceAvailable();

	@Generated
	@Selector("init")
	public native NSOutputStream init();

	@Generated
	@Selector("initToBuffer:capacity:")
	public native NSOutputStream initToBufferCapacity(BytePtr buffer,
			long capacity);

	@Generated
	@Selector("initToFileAtPath:append:")
	public native NSOutputStream initToFileAtPathAppend(String path,
			boolean shouldAppend);

	@Generated
	@Selector("initToMemory")
	public native NSOutputStream initToMemory();

	@Generated
	@Selector("initWithURL:append:")
	public native NSOutputStream initWithURLAppend(NSURL url,
			boolean shouldAppend);

	@Generated
	@Selector("outputStreamToBuffer:capacity:")
	public static native NSOutputStream outputStreamToBufferCapacity(
			BytePtr buffer, long capacity);

	@Generated
	@Selector("outputStreamToFileAtPath:append:")
	public static native NSOutputStream outputStreamToFileAtPathAppend(
			String path, boolean shouldAppend);

	@Generated
	@Selector("outputStreamToMemory")
	public static native NSOutputStream outputStreamToMemory();

	@Generated
	@Selector("outputStreamWithURL:append:")
	public static native NSOutputStream outputStreamWithURLAppend(NSURL url,
			boolean shouldAppend);

	@Generated
	@Selector("write:maxLength:")
	public native long writeMaxLength(
			@UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String buffer,
			long len);
}
