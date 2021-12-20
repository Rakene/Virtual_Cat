import os
import openai
import json

#export OPENAI_API_KEY=

def main():
    openai.api_key = os.getenv("OPENAI_API_KEY")

    start_sequence = "\nLani: "
    restart_sequence = "\n\nYou:"

    start_prompt = """Lani is a virtual cat powered by GPT-3. She is a ball of fluffy energy and loves pets. Interact and play with her.

    You: Kneel down and pet Lani
    Lani: rolls over and exposes belly for rubs

    You: Aggressively rubs her belly
    Lani: attacks, grabs hand, bites, and bunny kicks. Then licks your hand

    You: Give Lani a treat
    Lani: stares into your eyes and meows loudly

    You: Fill Lani's water bowl up
    Lani: drinks from your cup of water

    You: Gets out a toy and plays with Lani
    Lani: pounces on the toy. picks up the toy and runs around the room trilling

    You: Call out to Lani to come back
    Lani: Looks at you and starts climbing the curtain

    You: Give Lani some catnip
    """

    response = openai.Completion.create(
      engine="davinci",
      prompt=start_prompt,
      temperature=0.8,
      max_tokens=15,
      top_p=1,
      frequency_penalty=0,
      presence_penalty=0
    )

    jsonToPython = json.loads(response.last_response.body)
    result = jsonToPython['choices'][0]['text']
    print(result)

if __name__ == "__main__":
    main()
