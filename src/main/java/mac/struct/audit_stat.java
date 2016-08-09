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
public final class audit_stat extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public audit_stat() {
		super(audit_stat.class);
	}

	@Generated
	protected audit_stat(Pointer peer) {
		super(peer);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int as_version();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setAs_version(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int as_numevent();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setAs_numevent(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native int as_generated();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setAs_generated(int value);

	@Generated
	@StructureField(order = 3, isGetter = true)
	public native int as_nonattrib();

	@Generated
	@StructureField(order = 3, isGetter = false)
	public native void setAs_nonattrib(int value);

	@Generated
	@StructureField(order = 4, isGetter = true)
	public native int as_kernel();

	@Generated
	@StructureField(order = 4, isGetter = false)
	public native void setAs_kernel(int value);

	@Generated
	@StructureField(order = 5, isGetter = true)
	public native int as_audit();

	@Generated
	@StructureField(order = 5, isGetter = false)
	public native void setAs_audit(int value);

	@Generated
	@StructureField(order = 6, isGetter = true)
	public native int as_auditctl();

	@Generated
	@StructureField(order = 6, isGetter = false)
	public native void setAs_auditctl(int value);

	@Generated
	@StructureField(order = 7, isGetter = true)
	public native int as_enqueue();

	@Generated
	@StructureField(order = 7, isGetter = false)
	public native void setAs_enqueue(int value);

	@Generated
	@StructureField(order = 8, isGetter = true)
	public native int as_written();

	@Generated
	@StructureField(order = 8, isGetter = false)
	public native void setAs_written(int value);

	@Generated
	@StructureField(order = 9, isGetter = true)
	public native int as_wblocked();

	@Generated
	@StructureField(order = 9, isGetter = false)
	public native void setAs_wblocked(int value);

	@Generated
	@StructureField(order = 10, isGetter = true)
	public native int as_rblocked();

	@Generated
	@StructureField(order = 10, isGetter = false)
	public native void setAs_rblocked(int value);

	@Generated
	@StructureField(order = 11, isGetter = true)
	public native int as_dropped();

	@Generated
	@StructureField(order = 11, isGetter = false)
	public native void setAs_dropped(int value);

	@Generated
	@StructureField(order = 12, isGetter = true)
	public native int as_totalsize();

	@Generated
	@StructureField(order = 12, isGetter = false)
	public native void setAs_totalsize(int value);

	@Generated
	@StructureField(order = 13, isGetter = true)
	public native int as_memused();

	@Generated
	@StructureField(order = 13, isGetter = false)
	public native void setAs_memused(int value);
}
