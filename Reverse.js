function reverseWords(sentence) {
  let words = sentence.split(' ');
  let reversedWords = words.map(word => {
    let reversedWord = '';
    for (let i = word.length - 1; i >= 0; i--) {
      reversedWord += word[i];
    }
    return reversedWord;
  });
  let reversedSentence = reversedWords.join(' ');

  return reversedSentence;
}

const inputSentence = prompt("Enter a sentence:");
if (inputSentence) {
  const reversed = reverseWords(inputSentence);
  console.log(reversed);
} else {
  console.log("No input!");
}

