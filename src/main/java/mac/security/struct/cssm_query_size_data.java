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
public final class cssm_query_size_data extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public cssm_query_size_data() {
		super(cssm_query_size_data.class);
	}

	@Generated
	protected cssm_query_size_data(Pointer peer) {
		super(peer);
	}

	@Generated
	public cssm_query_size_data(int SizeInputBlock, int SizeOutputBlock) {
		super(cssm_query_size_data.class);
		setSizeInputBlock(SizeInputBlock);
		setSizeOutputBlock(SizeOutputBlock);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native int SizeInputBlock();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setSizeInputBlock(int value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int SizeOutputBlock();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setSizeOutputBlock(int value);
}
