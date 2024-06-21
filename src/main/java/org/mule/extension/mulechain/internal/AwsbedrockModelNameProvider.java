package org.mule.extension.mulechain.internal;
import java.util.Set;
import org.mule.runtime.api.value.Value;
import org.mule.runtime.extension.api.values.ValueBuilder;
import org.mule.runtime.extension.api.values.ValueProvider;
import org.mule.runtime.extension.api.values.ValueResolvingException;

public class AwsbedrockModelNameProvider implements ValueProvider {

	private static final Set<Value> VALUES_FOR = ValueBuilder.getValuesFor(
	"amazon.titan-text-express-v1",
	"amazon.titan-text-lite-v1",
	"amazon.titan-text-premier-v1:0",
	"anthropic.claude-v2",
	"anthropic.claude-v2:1",
	"anthropic.claude-instant-v1",
	"ai21.j2-mid-v1",
	"ai21.j2-ultra-v1",
	"cohere.command-text-v14",
	"cohere.command-light-text-v14",
	"meta.llama2-13b-chat-v1",
	"meta.llama2-70b-chat-v1",
	"meta.llama3-8b-instruct-v1:0",
	"meta.llama3-70b-instruct-v1:0",
	"mistral.mistral-7b-instruct-v0:2",
	"mistral.mixtral-8x7b-instruct-v0:1",
	"mistral.mistral-large-2402-v1:0",
	"mistral.mistral-small-2402-v1:0",
	"stability.stable-diffusion-xl-v0"
	// "amazon.titan-text-express-v1:0:8k",
	// "amazon.titan-text-lite-v1:0:4k",
	// "amazon.titan-text-premier-v1:0:32K",
	// "anthropic.claude-v2:0:18k",
	// "anthropic.claude-v2:0:100k",
	// "anthropic.claude-v2:1:18k",
	// "anthropic.claude-v2:1:200k",
	// "anthropic.claude-instant-v1:2:100k",
	// "ai21.j2-ultra-v1:0:8k",
	// "cohere.command-text-v14:7:4k",
	// "cohere.command-light-text-v14:7:4k",
	// "meta.llama2-13b-chat-v1:0:4k"
	);

	@Override
	public Set<Value> resolve() throws ValueResolvingException {
		
		return VALUES_FOR;
	}

}