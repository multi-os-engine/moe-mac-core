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

package mac.struct;


import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class thread_identifier_info extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public thread_identifier_info() {
		super(thread_identifier_info.class);
	}

	@Generated
	protected thread_identifier_info(Pointer peer) {
		super(peer);
	}

	@Generated
	public thread_identifier_info(long thread_id, long thread_handle,
			long dispatch_qaddr) {
		super(thread_identifier_info.class);
		setThread_id(thread_id);
		setThread_handle(thread_handle);
		setDispatch_qaddr(dispatch_qaddr);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native long thread_id();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setThread_id(long value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native long thread_handle();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setThread_handle(long value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native long dispatch_qaddr();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setDispatch_qaddr(long value);
}
