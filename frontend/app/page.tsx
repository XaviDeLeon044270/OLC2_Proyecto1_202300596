'use client';
import { Editor } from '@monaco-editor/react';
import { useState } from 'react';

const API_URL = 'http://localhost:5065';

export default function Home() {

  const [code, setCode] = useState<string>('');
  const [output, setOutput] = useState<string>(''); 

  const handleExecute = () => {

    fetch(`${API_URL}/compile`, {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({ code })
    })
      .then(response => response.json())
      .then(data => {
        setOutput(data.result);
      })
      .catch(error => { 
        console.error('Error:', error);
      });
  }

  return (
    <div className='flex flex-col items-center justify-center min-h-screen py-2'>
      <Editor height="70vh" defaultLanguage="go" theme='vs-dark' value = {code} onChange={(value) => setCode(value || '')} />
      <button className='mt-4 bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded' onClick={handleExecute}>
        Run
      </button>
      {
        output && (
          <div className='flex flex-col items-center justify-center'>
            <h2>Output:</h2>
            <pre>{output}</pre>
          </div>
        )
      }
    </div>
  
  );

}
